package cn.com.pep.model.bridge;
/**
 * 
 * @Title: AbstractSrc  
 * @Description:  ���󻯽�ɫ��Abstraction��:�������󻯽�ɫ�Ķ��壬������һ����ʵ�ֻ���������ã�
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
