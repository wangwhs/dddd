package cn.com.pep.simple;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("请输入一个类名称:");
		String name = scanner.next();

		try {
			Class<?> c1 = Class.forName(name);
			System.err.print("Class :");
			String modifiers = Modifier.toString(c1.getModifiers());
			if (modifiers.length() > 0) {
				System.err.print(modifiers + " ");
			}
			System.err.print(name);
			Class<?> superclass = c1.getSuperclass();
			if (superclass != null && superclass != Object.class) {
				System.err.print(" extends " + superclass.getName());
			}

			System.err.println(" \n{");
			printConstructors(c1);
			System.err.println();
			printMethods(c1);
			System.err.println();
			printFields(c1);
			System.err.print("\n}");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Title: printConstructors
	 * @Description:
	 * @param c1
	 */
	@SuppressWarnings("rawtypes")
	public static void printConstructors(Class c1) {
		Constructor[] constructors = c1.getConstructors();
		for (Constructor c : constructors) {
			System.err.print(" ");
			String modifiers = Modifier.toString(c.getModifiers());
			System.err.print(modifiers + " ");
			String name = c.getName();
			System.err.print(name + "(");
			Class[] parameterTypes = c.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0) {
					System.err.print(",");
				}
				System.err.print(parameterTypes[i].getName());
			}
			System.err.print(");");
		}
	}

	/**
	 * 
	 * @Title: printMethods
	 * @Description:
	 * @param c1
	 */
	@SuppressWarnings("rawtypes")
	public static void printMethods(Class c1) {
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods) {
			System.err.print(" ");
			String modifiers = Modifier.toString(m.getModifiers());
			System.err.print(modifiers + " ");
			Class<?> returnType = m.getReturnType();
			String retName = returnType.getName();
			System.err.print(retName + " ");
			String name = m.getName();
			System.err.print(name + "(");
			Class<?>[] parameterTypes = m.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0) {
					System.err.print(",");
				}
				System.err.print(parameterTypes[i].getName());
			}

			System.err.print(");");
			System.err.println();
		}
	}

	/**
	 * @Title: printFields
	 * @Description:
	 * @param c1
	 */
	public static void printFields(Class c1) {
		Field[] fields = c1.getDeclaredFields();
		for (Field f : fields) {
			System.err.print(" ");
			String modifier = Modifier.toString(f.getModifiers());
			System.err.print(modifier + " ");
			Class<?> type = f.getType();
			String typeName = type.getName();
			System.err.print(typeName);
			String name = f.getName();
			System.err.print(" " + name);
			System.err.print(";");
			System.err.println();
		}
	}
}
