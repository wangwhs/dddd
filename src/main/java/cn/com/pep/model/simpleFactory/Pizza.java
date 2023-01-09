package cn.com.pep.model.simpleFactory;
/**
 * @Title: Pizza  
 * @Description:  抽象产品角色
 * @author wwh 
 * @date 2022-8-22 14:18:25
 */
public abstract class Pizza {
	/**
	 * @Title: prepare
	 * @Description:
	 */
	public abstract void prepare();

	/**
	 * @Title: bake
	 * @Description:
	 */
	public abstract void bake();

	/**
	 * @Title: cut
	 * @Description:
	 */
	public abstract void cut();

	/**
	 * @Title: box
	 * @Description:
	 */
	public abstract void box();
	
}
