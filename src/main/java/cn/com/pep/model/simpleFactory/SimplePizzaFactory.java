package cn.com.pep.model.simpleFactory;

/**
 * @Title: SimplePizzaFactory
 * @Description: π§≥ß¿‡
 * @author wwh
 * @date 2022-8-22 14:19:03
 */
public class SimplePizzaFactory {
	
	/**
	 * @Title: createPizza 
	 * @Description:  
	 * @param type
	 * @return
	 */
	public static Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		}
		
		if ("vegetable".equals(type)) {
			pizza = new VegetablePizza();
		}
		
		if ("chocalate".equals(type)) {
			pizza = new ChocolatePizza();
		}
		
		return pizza;
	}

}
