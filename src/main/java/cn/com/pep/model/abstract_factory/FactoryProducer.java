package cn.com.pep.model.abstract_factory;
/**
 * 
 * @Title: FactoryProducer  
 * @Description:  
 * @author wwh 
 * @date 2022-8-24 10:14:05
 */
public class FactoryProducer {
	
	/**
	 * 
	 * @Title: getFactory 
	 * @Description:  
	 * @param factory
	 * @return
	 */
	public static AbstractFactory getFactory(String factory) {
		
		if ("shape".equalsIgnoreCase(factory)) {
			return new ShapeFactory();
		}
		
		if ("color".equalsIgnoreCase(factory)) {
			return new ColorFactory();
		}
		
		return null;
	}
}
