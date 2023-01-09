package cn.com.pep.model.decarator.impl;

import java.util.Date;

/**
 * @Title: Component  
 * @Description:  原始对象的接口定义
 * @author wwh 
 * @date 2022-6-14 15:23:54
 */
public interface Component {

	/**
	 * @Title: calcPrize 
	 * @Description:  
	 * @param user_id
	 * @param begin
	 * @param end
	 * @return
	 */
	public double calcPrize(String user_id,Date begin,Date end);
}
