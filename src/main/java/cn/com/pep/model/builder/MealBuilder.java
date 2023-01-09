package cn.com.pep.model.builder;
/**
 * 
 * @Title: MealBuilder  
 * @Description:  
 * @author wwh 
 * @date 2022-8-26 9:35:53
 */
public class MealBuilder {
	/**
	 * @Title: prepareVegMeal 
	 * @Description:  
	 * @return
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegeBurger());
		meal.addItem(new Cocacola());
		return meal;
	}
	
	/**
	 * @Title: prepareChickenMeal 
	 * @Description:  
	 * @return
	 */
	public Meal prepareChickenMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
