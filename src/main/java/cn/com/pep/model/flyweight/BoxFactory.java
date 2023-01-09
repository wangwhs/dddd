package cn.com.pep.model.flyweight;

import java.util.HashMap;

/**
 * 
 * @Title: BoxFactory
 * @Description:享元工厂，用来创建并管理Flyweight对象，当用户请求一个Flyweight对象时，FlyweightFactory工厂提供一个已经创建的实例或者新创建一个实例；
 * @author wwh
 * @date 2022-9-13 14:26:27
 */
public class BoxFactory {

	/**
	   * 创建一个池，用来缓存需要共享的享元对象
	 */
	private static HashMap<String, AbstaractBox> map = new HashMap<>();

	public BoxFactory() {
		map.put("I", new IBox());
		map.put("M", new MBox());
		map.put("Z", new ZBox());
	}
	
	private static class SingtonHolder{
		private static final BoxFactory INSTANCE = new BoxFactory();
	}
	
	/**
	 * @Title: getFactory 
	 * @Description:  
	 * @return
	 */
	public static final BoxFactory getFactory() {
		return SingtonHolder.INSTANCE;
	}
	
	/**
	 * @Title: getBox 
	 * @Description:  
	 * @param box
	 * @return
	 */
	public AbstaractBox getBox(String box) {
		if (map.containsKey(box)) {
			return map.get(box);
		}
		return null;
	}

}
