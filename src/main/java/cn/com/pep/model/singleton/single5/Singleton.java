package cn.com.pep.model.singleton.single5;

/**
 * @Title: Singleton
 * @Description: 静态内部类
 * @author wwh
 * @date 2022-8-24 16:12:51
 */
public class Singleton {
	
	/**
	 * 是否是懒加载：是
	 * 是否是多线程安全：是
	 * 实现难度：一般
	 * 描述：这种方式能达到和双检锁方式一样的功效，实现更简单；
	 * 这种方式同样利用了classloader机制来保证实例初始化的时候只有一个线程，它跟饿汉式不同的是：
	 * 第三种方式，只要Sington类被加载了，那么instance实例就会被初始化，没有达到懒加载的效果，
	 * 而这种方式即使Singleton类被加载了，但是SingletonHolder类没有被主动使用，只有通过显示调用
	 * getInstance()方法时候，才会显示加载SingletonHolder类，从而实例化instance对象；
	 */

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
