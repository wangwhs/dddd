package cn.com.pep.model.singleton.single4;

/**
 * 
 * @Title: Singleton
 * @Description:双重校验锁
 * @author wwh
 * @date 2022-8-24 16:02:19
 */
public class Singleton {
	
	/**
	 * 是否是懒加载：是
	 * 是否多线程安全：是
	 * 实现难度：较复杂
	 * 描述：这种方式采用锁双锁机制，安全且在多线程情况下能保持高性能；
	 */
	
	private volatile static Singleton instance;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
