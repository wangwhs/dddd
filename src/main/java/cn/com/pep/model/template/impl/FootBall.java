package cn.com.pep.model.template.impl;
/**
 * @Title: FootBall  
 * @Description:  
 * @author wwh 
 * @date 2022-7-12 11:01:12
 */
public class FootBall extends Game{

	@Override
	public void initialize() {
		System.err.println("I am Football!");
	}

	@Override
	public void startPlay() {
		System.err.println("I am playing Football");
	}

	@Override
	public void endPlay() {
		System.err.println("Playing Football over!");
	}

}
