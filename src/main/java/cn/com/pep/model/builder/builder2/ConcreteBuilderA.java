package cn.com.pep.model.builder.builder2;
/**
 * 
 * @Title: ConcreteBuilderA  
 * @Description:  具体建造者A
 * @author wwh 
 * @date 2022-9-1 10:00:40
 */
public class ConcreteBuilderA extends Builder{
	
	private Product product = new Product();

	@Override
	public void builderPartA() {
		product.addPart("VegetableBurger");
	}

	@Override
	public void builderPartB() {
		product.addPart("Cocacola");
	}

	@Override
	public Product getProduct() {
		return product;
	}

	
}
