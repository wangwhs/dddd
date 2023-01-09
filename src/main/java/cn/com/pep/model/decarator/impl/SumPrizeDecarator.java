package cn.com.pep.model.decarator.impl;

import java.util.Date;

public class SumPrizeDecarator extends Decarator {

	public SumPrizeDecarator(Component component) {
		super(component);
	}

	@Override
	public double calcPrize(String user_id, Date begin, Date end) {
		double money = super.calcPrize(user_id, begin, end);
		System.err.println("*****ÀÛ¼Æ½±½ðÊÇ:" + sumSale * 0.01 + "*****");
		return money + sumSale * 0.01;
	}

}
