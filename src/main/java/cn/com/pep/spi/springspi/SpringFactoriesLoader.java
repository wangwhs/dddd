/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.com.pep.spi.springspi;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.core.io.UrlResource;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

/**
 * General purpose factory loading mechanism for internal use within the framework.
 *
 * <p>{@code SpringFactoriesLoader} {@linkplain #loadFactories loads} and instantiates
 * factories of a given type from {@value #FACTORIES_RESOURCE_LOCATION} files which
 * may be present in multiple JAR files in the classpath. The {@code spring.factories}
 * file must be in {@link Properties} format, where the key is the fully qualified
 * name of the interface or abstract class, and the value is a comma-separated list of
 * implementation class names. For example:
 *
 * <pre class="code">example.MyService=example.MyServiceImpl1,example.MyServiceImpl2</pre>
 *
 * where {@code example.MyService} is the name of the interface, and {@code MyServiceImpl1}
 * and {@code MyServiceImpl2} are two implementations.
 *
 * @author Arjen Poutsma
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @since 3.2
 */
public abstract class SpringFactoriesLoader {

	private static final Log logger = LogFactory.getLog(SpringFactoriesLoader.class);

	/**
	 * The location to look for factories.
	 * <p>Can be present in multiple JAR files.
	 */
	public static final String FACTORIES_RESOURCE_LOCATION = "META-INF/spring.factories";


	/**
	 * Load and instantiate the factory implementations of the given type from
	 * {@value #FACTORIES_RESOURCE_LOCATION}, using the given class loader.
	 * <p>The returned factories are sorted in accordance with the {@link AnnotationAwareOrderComparator}.
	 * <p>If a custom instantiation strategy is required, use {@link #loadFactoryNames}
	 * to obtain all registered factory names.
	 * @param factoryClass the interface or abstract class representing the factory
	 * @param classLoader the ClassLoader to use for loading (can be {@code null} to use the default)
	 * @see #loadFactoryNames
	 * @throws IllegalArgumentException if any factory implementation class cannot
	 * be loaded or if an error occurs while instantiating any factory
	 */
	//使用指定的类加载器，加载和实例化给定工厂类型的实现，入口方法
	public static <T> List<T> loadFactories(Class<T> factoryClass, ClassLoader classLoader) {
		Assert.notNull(factoryClass, "'factoryClass' must not be null");
		ClassLoader classLoaderToUse = classLoader;
		if (classLoaderToUse == null) {
			//未指定类加载器，就使用当前类的类加载器
			classLoaderToUse = SpringFactoriesLoader.class.getClassLoader();
		}
		//使用指定的类加载器，加载指定指定工厂的实现的全路径名
		List<String> factoryNames = loadFactoryNames(factoryClass, classLoaderToUse);
		if (logger.isTraceEnabled()) {
			logger.trace("Loaded [" + factoryClass.getName() + "] names: " + factoryNames);
		}
		List<T> result = new ArrayList<T>(factoryNames.size());
		//遍历集合工厂实现类名称集合，通过反射生成工厂实现类的实例，并添加到集合中返回
		for (String factoryName : factoryNames) {
			result.add(instantiateFactory(factoryName, factoryClass, classLoaderToUse));
		}
		AnnotationAwareOrderComparator.sort(result);
		return result;
	}

	/**
	 * Load the fully qualified class names of factory implementations of the
	 * given type from {@value #FACTORIES_RESOURCE_LOCATION}, using the given
	 * class loader.
	 * @param factoryClass the interface or abstract class representing the factory
	 * @param classLoader the ClassLoader to use for loading resources; can be
	 * {@code null} to use the default
	 * @see #loadFactories
	 * @throws IllegalArgumentException if an error occurs while loading factory names
	 */
	//获取指定工厂的所有实现类的全路径名
	public static List<String> loadFactoryNames(Class<?> factoryClass, ClassLoader classLoader) {
		//工厂名称
		String factoryClassName = factoryClass.getName();
		try {
			//搜索当前classpath下所有jar包下的/META-INF/spring.factories文件，并将所有文件路径以枚举的形式返回
			Enumeration<URL> urls = (classLoader != null ? classLoader.getResources(FACTORIES_RESOURCE_LOCATION) :
					ClassLoader.getSystemResources(FACTORIES_RESOURCE_LOCATION));
			List<String> result = new ArrayList<String>();
			//枚举值的遍历
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();
				//将遍历到的文件转换成Properties格式
				Properties properties = PropertiesLoaderUtils.loadProperties(new UrlResource(url));
				/**
				 * spring.factories中内容是key-value结构，key是工厂全路径名，value是工厂的实现类全路径名，可以有多个实现用逗号隔开，
				 * 一个接口的实现对应一个key-value,其中可以包含多个接口的实现，这点和java的spi不一样，java原生的SPI，一个spi接口对应一个文件
				 */
				//通过Key获取value，即工厂实现类的全路径名
				String factoryClassNames = properties.getProperty(factoryClassName);
				//用逗号拆分，加入集合中返回
				result.addAll(Arrays.asList(StringUtils.commaDelimitedListToStringArray(factoryClassNames)));
			}
			return result;
		}
		catch (IOException ex) {
			throw new IllegalArgumentException("Unable to load [" + factoryClass.getName() +
					"] factories from location [" + FACTORIES_RESOURCE_LOCATION + "]", ex);
		}
	}

	@SuppressWarnings("unchecked")
	private static <T> T instantiateFactory(String instanceClassName, Class<T> factoryClass, ClassLoader classLoader) {
		try {
			//使用指定的类加载器，加载class到方法区中，得到它所代表的的类的Class对象
			Class<?> instanceClass = ClassUtils.forName(instanceClassName, classLoader);
			//判定工厂和实现类是否是同一类型
			if (!factoryClass.isAssignableFrom(instanceClass)) {
				throw new IllegalArgumentException(
						"Class [" + instanceClassName + "] is not assignable to [" + factoryClass.getName() + "]");
			}
			//获取无参构造方法
			Constructor<?> constructor = instanceClass.getDeclaredConstructor();
			//绕过构造方法的访问修饰
			ReflectionUtils.makeAccessible(constructor);
			//反射生成对象
			return (T) constructor.newInstance();
		}
		catch (Throwable ex) {
			throw new IllegalArgumentException("Cannot instantiate factory class: " + factoryClass.getName(), ex);
		}
	}

}
