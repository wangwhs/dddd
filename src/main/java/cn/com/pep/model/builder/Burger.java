package cn.com.pep.model.builder;
/**
 * 
 * @Title: Burger  
 * @Description:  
 * @author wwh 
 * @date 2022-8-26 9:13:00
 */
public abstract class Burger implements Item{
	
	@Override
	public Packing pack() {
		return new Wrapper();
	}
	
	@Override
	public abstract float getCost();

}
