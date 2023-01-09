package cn.com.pep.model.template.impl;
/**
 * @Title: BasketBall  
 * @Description:  
 * @author wwh 
 * @date 2022-7-12 11:00:36
 */
public class BasketBall extends Game{

	@Override
	public void initialize() {
		System.err.println("I am BasketBall!");
	}

	@Override
	public void startPlay() {
		System.err.println("I am playing BasketBall!");
	}

	@Override
	public void endPlay() {
		System.err.println("Playing BasketBall over!");
	}

}
