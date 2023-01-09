package cn.com.pep.model.builder;

/**
 * 
 * @Title: ChickenBurger
 * @Description:
 * @author wwh
 * @date 2022-8-26 9:22:30
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float getCost() {
		return 30.0f;
	}

}
