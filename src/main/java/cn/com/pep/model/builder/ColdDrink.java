package cn.com.pep.model.builder;

/**
 * 
 * @Title: ColdDrink
 * @Description:
 * @author wwh
 * @date 2022-8-26 9:15:04
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing pack() {
		return new Bottle();
	}

	@Override
	public abstract float getCost();
}
