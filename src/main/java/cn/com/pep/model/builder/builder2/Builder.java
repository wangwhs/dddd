package cn.com.pep.model.builder.builder2;
/**
 * 
 * @Title: Builder  
 * @Description:  抽象建造者
 * @author wwh 
 * @date 2022-9-1 9:56:08
 */
public abstract class Builder {
	
	/**
	 * 
	 * @Title: builderPartA 
	 * @Description:
	 */
	public abstract void builderPartA();
	
	/**
	 * 
	 * @Title: builderPartB 
	 * @Description:
	 */
	public abstract void builderPartB();
	
	/**
	 * 
	 * @Title: getProduct 
	 * @Description:  
	 * @return
	 */
	public abstract Product getProduct();
}
