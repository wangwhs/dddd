package cn.com.pep.model.simpleFactory;
/**
 * @Title: ChocalatePizza  
 * @Description:  具体产品角色
 * @author wwh 
 * @date 2022-8-22 14:23:11
 */
public class ChocolatePizza extends Pizza{

	@Override
	public void prepare() {
		System.err.println("prepare ChocolatePizza ...");
	}

	@Override
	public void bake() {
		System.err.println("bake ChocolatePizza ...");
	}

	@Override
	public void cut() {
		System.err.println("cut ChocolatePizza ...");
	}

	@Override
	public void box() {
		System.err.println("box ChocolatePizza ...");
	}

}
