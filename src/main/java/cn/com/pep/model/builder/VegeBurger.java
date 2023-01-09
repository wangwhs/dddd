package cn.com.pep.model.builder;
/**
 * 
 * @Title: VegaBurger  
 * @Description:  
 * @author wwh 
 * @date 2022-8-26 9:16:47
 */
public class VegeBurger extends Burger{

	@Override
	public String name() {
		return "VegeBurger";
	}

	@Override
	public float getCost() {
		return 25.0f;
	}

}
