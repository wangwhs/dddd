package cn.com.pep.mysql;
/**
 * 
 * @FileName T.java
 * @version:1.0
 * @Description: 
 * @author: wwh
 * @date: 2022年9月20日 下午4:33:54
 */
public class T {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
		
		System.err.println(clazz);
	}

}
