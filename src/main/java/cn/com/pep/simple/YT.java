package cn.com.pep.simple;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class YT {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe) f.get(null);
        Class tc = String[].class;
        int TBASE = unsafe.arrayBaseOffset(tc);
        int ts = unsafe.arrayIndexScale(tc);
        System.err.println(ts);
	}
}
