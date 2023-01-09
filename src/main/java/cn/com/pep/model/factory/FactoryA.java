package cn.com.pep.model.factory;

/**
 * 
 * @Title: FactoryA
 * @Description:
 * @author wwh
 * @date 2022-8-23 13:47:05
 */
public class FactoryA extends Factory {

	@Override
	public Product manufacture() {
		return new ProductA();
	}

}
