package cn.com.pep.simple;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @Title: ObjectAnalyzer  
 * @Description:  
 * @author wwh 
 * @date 2022-3-22 16:47:07
 */
public class ObjectAnalyzer {
	
	private static ArrayList<Object> visited = new ArrayList<>();
	
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
	}

	public static String toString(Object object) {
		if (object == null) {
			return "null";
		}

		if (visited.contains(object)) {
			return "...";
		}
		
		visited.add(object);

		Class<? extends Object> c1 = object.getClass();
		if (c1 == String.class) {
			return (String) object;
		}

		if (c1.isArray()) {
			String r = c1.getComponentType() + "[]{";
			for (int i = 0; i < Array.getLength(object); i++) {
				if (i > 0) {
					r += ",\n";
				}

				r += "\t";
				Object val = Array.get(object, i);
				if (c1.getComponentType().isPrimitive()) {
					r += val;
				} else {
					r += toString(val);
				}
			}

			return r + "\n}";
		}

		/* 既不是字符串也不是数组 */
		String r = c1.getName();
		r += "[";
		do {
			Field[] fields = c1.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			for (Field f : fields) {
				if (!Modifier.isStatic(f.getModifiers())) {
					if (!r.endsWith("[")) {
						r += ",";
					}

					/* 获取域对象的名称和值 */
					String name = f.getName();
					r += name + "=";
					try {
						Class<?> t = f.getType();
						Object val = f.get(object);
						if (t.isPrimitive()) {
							r += val;
						} else {
							r += toString(val);
						}

					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
			
			/* 子类继承父类,通过反射不能直接获取父类的实例域,递归调用 */
			c1 = c1.getSuperclass();
		} while (c1 != Object.class);
		r += "]";
		return r;
	}
}
