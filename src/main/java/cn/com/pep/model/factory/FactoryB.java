package cn.com.pep.model.factory;

/**
 * 
 * @Title: FactoryB
 * @Description:
 * @author wwh
 * @date 2022-8-23 13:49:46
 */
public class FactoryB extends Factory {

	@Override
	public Product manufacture() {
		return new ProductB();
	}

}
