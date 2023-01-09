package cn.com.pep.model.simpleFactory;
/**
 * @Title: CheesePizza  
 * @Description:  具体产品角色
 * @author wwh 
 * @date 2022-8-22 14:22:53
 */
public class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.err.println("prepare CheesePizza ...");
	}

	@Override
	public void bake() {
		System.err.println("bake CheesePizza ...");		
	}

	@Override
	public void cut() {
		System.err.println("cut CheesePizza ...");		
	}

	@Override
	public void box() {
		System.err.println("box CheesePizza ...");		
	}

}
