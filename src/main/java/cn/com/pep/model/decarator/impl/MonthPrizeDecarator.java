package cn.com.pep.model.decarator.impl;

import java.util.Date;

/**
 * @Title: MonthPrizeDecarator
 * @Description: 装饰对象
 * @author wwh
 * @date 2022-6-14 15:30:17
 */
public class MonthPrizeDecarator extends Decarator {

	public MonthPrizeDecarator(Component component) {
		super(component);
	}

	@Override
	public double calcPrize(String user_id, Date begin, Date end) {
		double money = super.calcPrize(user_id, begin, end);
		System.err.println("*****当月奖金是:" + monthSale * 0.03 + "*****");
		return money + monthSale * 0.03;
	}

}
