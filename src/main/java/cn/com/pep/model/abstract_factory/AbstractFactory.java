package cn.com.pep.model.abstract_factory;

/**
 * 
 * @Title: AbstractFactory
 * @Description:
 * @author wwh
 * @date 2022-8-24 10:02:39
 */
public abstract class AbstractFactory {
	
	/**
	 * 
	 * @Title: getColor 
	 * @Description:  
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);
	
	/**
	 * 
	 * @Title: getShape 
	 * @Description:  
	 * @param shape
	 * @return
	 */
	public abstract Shape getShape(String shape);
}
