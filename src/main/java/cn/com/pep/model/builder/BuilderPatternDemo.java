package cn.com.pep.model.builder;
/**
 * 
 * @Title: BuilderPatternDemo  
 * @Description:  
 * @author wwh 
 * @date 2022-8-26 9:39:28
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		
		Meal vegMeal = builder.prepareVegMeal();
		System.err.println("Veg Meal");
		vegMeal.showItems();
		System.err.println("Total Cost: " + vegMeal.getCost());
		
		Meal chickenMeal = builder.prepareChickenMeal();
		System.err.println("Chicken Meal");
		chickenMeal.showItems();
		System.err.println("Total Cost: " + chickenMeal.getCost());
	}
}
