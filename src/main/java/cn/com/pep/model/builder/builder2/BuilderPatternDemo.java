package cn.com.pep.model.builder.builder2;
/**
 * 
 * @Title: BuilderPatternDemo  
 * @Description:  ≤‚ ‘¿‡
 * @author wwh 
 * @date 2022-9-1 10:13:51
 */
public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilderA();
		Director director = new Director();
		director.creatProduct(builder);
		Product p = builder.getProduct();
		p.show();
		
		builder = new ConcreteBuilderB();
		director.creatProduct(builder);
		p = builder.getProduct();
		p.show();
		
	}
}
