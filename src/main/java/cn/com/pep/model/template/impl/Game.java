package cn.com.pep.model.template.impl;

/**
 * @Title: Game
 * @Description: Template Class
 * @author wwh
 * @date 2022-7-12 10:56:31
 */
public abstract class Game {
	
	/**
	 * @Title: initialize 
	 * @Description:≥ı ºªØ
	 */
	public abstract void initialize();
	
	/**
	 * @Title: startPlay 
	 * @Description:
	 */
	public abstract void startPlay();
	
	/**
	 * @Title: endPlay 
	 * @Description:
	 */
	public abstract void endPlay();
	
	/**
	 * @Title: play 
	 * @Description: template method
	 */
	public final void play() {

		initialize();

		startPlay();
		
		System.err.println("Let's have a rest!");

		endPlay();
	}
}
