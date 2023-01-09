package cn.com.pep.model.singleton.single6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException,
			IllegalArgumentException, InvocationTargetException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://enum.out"));
		Singleton singleton = Singleton.SPRING;
		oos.writeObject(singleton);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://enum.out"));
		Object obj = ois.readObject();
		System.err.println(singleton == obj);
		ois.close();
		
		Singleton.SPRING.say("hello");
		Class<? extends Singleton> class1 = Singleton.SPRING.getClass();
		Singleton c1 = class1.newInstance();
		System.err.println(c1);

	}

}
