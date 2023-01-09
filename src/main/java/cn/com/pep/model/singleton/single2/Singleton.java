package cn.com.pep.model.singleton.single2;
/**
 * 
 * @Title: Singleton  
 * @Description: 线程安全的懒汉式 
 * @author wwh 
 * @date 2022-8-24 15:07:07
 */
public class Singleton {
	
	/**
	 * 是否是懒加载：是
	 * 是否线程安全：是
	 * 实现难度：容易
	 * 描述：这种方式具备很好的lazy loading，能够在多线程中很好的工作，但是效率比较低，99%情况下不需要同步；
	 * 优点：第一次调用才初始化，避免了内存的浪费；
	 * 缺点：必须加锁synchronized才能保证单例，单加锁会影响效率；
	 */
	
	private static Singleton instance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

}
