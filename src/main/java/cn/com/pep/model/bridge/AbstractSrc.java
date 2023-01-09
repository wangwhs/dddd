package cn.com.pep.model.bridge;
/**
 * 
 * @Title: AbstractSrc  
 * @Description:  抽象化角色（Abstraction）:给出抽象化角色的定义，并保存一个对实现化对象的引用；
 * @author wwh 
 * @date 2022-9-9 11:07:37
 */
public abstract class AbstractSrc {
	
	Bridge bridge;
	
	public AbstractSrc(Bridge bridge) {
		this.bridge = bridge;
	}
	
	/**
	 * 
	 * @Title: src 
	 * @Description:
	 */
	public abstract void src();
	
	/**
	 * @Title: fromTo 
	 * @Description:
	 */
	public void to() {
		src();
		bridge.target();
	}

}
