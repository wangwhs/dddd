package cn.com.pep.model.builder;

/**
 * 
 * @Title: Item
 * @Description:
 * @author wwh
 * @date 2022-8-26 9:04:22
 */
public interface Item {
	
	/**
	 * 
	 * @Title: name 
	 * @Description:  
	 * @return
	 */
	public String name();
	
	/**
	 * 
	 * @Title: getCost 
	 * @Description:  
	 * @return
	 */
	public float getCost();
	
	/**
	 * 
	 * @Title: pack 
	 * @Description:  
	 * @return
	 */
	public Packing pack();
}
