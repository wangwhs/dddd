package cn.com.pep.model.singleton.single1;
/**
 * 
 * @Title: Singlton  
 * @Description:  懒汉式单例
 * @author wwh 
 * @date 2022-8-24 15:03:44
 */
public class Singlton {
	/**
	 * 是否懒加载：是
	 * 是否多线程安全：否，不支持多线程，所以严格意义来讲并不是单例模式
	 * 实现难易程度：易
	 */
	
	private static Singlton instance;
	
	private Singlton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singlton getInstance() {
		if (instance == null) {
			instance = new Singlton();
		}
		return instance;
	}
}
