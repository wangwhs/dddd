package cn.com.pep.model.decarator.impl;

import java.util.Date;

/**
 * @Title: Decarator  
 * @Description:  װ������ɫ
 * @author wwh 
 * @date 2022-6-14 15:26:40
 */
public abstract class Decarator implements Component{
	
	protected Component component;
	
	protected double monthSale = 10000;
	
	protected double sumSale = 200000;
	
	protected double groupSale = 3000000;
	
	/**
	 * @Title: </p>  
	 * @Description: </p>  
	 * @param component
	 */
	public Decarator(Component component) {
		this.component = component;
	}
	
	@Override
	public double calcPrize(String user_id, Date begin, Date end) {
		/*����ԭʼ�����ʵ��*/
		return component.calcPrize(user_id, begin, end);
	}

}
