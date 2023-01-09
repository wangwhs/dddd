package cn.com.pep.model.builder;
/**
 * 
 * @Title: Pepsi  
 * @Description:  
 * @author wwh 
 * @date 2022-8-26 9:28:10
 */
public class Pepsi extends ColdDrink{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float getCost() {
		return 2.5f;
	}

}
