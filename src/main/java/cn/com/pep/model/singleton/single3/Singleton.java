package cn.com.pep.model.singleton.single3;

/**
 * 
 * @Title: Singleton
 * @Description:饿汉式单例
 * @author wwh
 * @date 2022-8-24 15:45:01
 */
public class Singleton {
	/**
	 * 是否是懒加载：否
	 * 是否线程安全：是
	 * 实现难度：容易
	 * 描述：比较常用，但是容易产生垃圾对象；
	 * 优点：没有加锁，执行效率会提高；
	 * 缺点：类加载时候就会初始化，浪费内存；
	 * 它基于classloader机制避免了多线程同步的问题，不过，instance在类装载的时候就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用getInstance，
	 * 但也不确定有其他方式导致类加载，这时候就没有达到懒加载的效果；
	 */
	
	private static Singleton instance = new Singleton();

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		return instance;
	}

}
