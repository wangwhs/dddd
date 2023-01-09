package cn.com.pep.dynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @Title: MethodHandleTest  
 * @Description: invokePackage 
 * @author wwh 
 * @date 2022-3-17 15:21:27
 */
public class MethodHandleTest {
	
	static class ClassA{
		public void println(String s) {
			System.err.println(s);
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, Throwable {
		Object object = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
		getPrintMethod(object).invoke("hello");
	}

	/**
	 * @Title: getPrintMethod 
	 * @Description:  ��ȡĿ�귽��
	 * @param receiver
	 * @return
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 */
	private static MethodHandle getPrintMethod(Object receiver) throws NoSuchMethodException, IllegalAccessException {
		MethodType mt = MethodType.methodType(void.class, String.class);
		MethodHandle mh = MethodHandles.lookup().findVirtual(receiver.getClass(), "println", mt).bindTo(receiver);
		return mh;
	}
}
