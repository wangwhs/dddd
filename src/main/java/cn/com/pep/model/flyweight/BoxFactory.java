package cn.com.pep.model.flyweight;

import java.util.HashMap;

/**
 * 
 * @Title: BoxFactory
 * @Description:��Ԫ��������������������Flyweight���󣬵��û�����һ��Flyweight����ʱ��FlyweightFactory�����ṩһ���Ѿ�������ʵ�������´���һ��ʵ����
 * @author wwh
 * @date 2022-9-13 14:26:27
 */
public class BoxFactory {

	/**
	   * ����һ���أ�����������Ҫ�������Ԫ����
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
