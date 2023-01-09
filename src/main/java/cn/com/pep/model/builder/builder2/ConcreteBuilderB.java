package cn.com.pep.model.builder.builder2;
/**
 * 
 * @Title: ConcreteBuilderB  
 * @Description:  具体建造者B
 * @author wwh 
 * @date 2022-9-1 10:04:48
 */
public class ConcreteBuilderB extends Builder{
	
	private Product product = new Product();

	@Override
	public void builderPartA() {
		// TODO Auto-generated method stub
		product.addPart("ChickenBurger");
	}

	@Override
	public void builderPartB() {
		// TODO Auto-generated method stub
		product.addPart("Pepsi");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
