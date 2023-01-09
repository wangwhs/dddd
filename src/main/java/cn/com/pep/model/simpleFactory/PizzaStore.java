package cn.com.pep.model.simpleFactory;

/**
 * @Title: PizzaStore
 * @Description:
 * @author wwh
 * @date 2022-8-22 14:34:26
 */
public class PizzaStore {


	/**
	 * @Title: orderPizza
	 * @Description:
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = SimplePizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
