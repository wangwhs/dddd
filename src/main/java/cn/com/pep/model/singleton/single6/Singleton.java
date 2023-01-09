package cn.com.pep.model.singleton.single6;

import java.io.Serializable;

/**
 * 
 * @Title: Singleton
 * @Description:
 * @author wwh
 * @date 2022-8-24 16:49:19
 */
public enum Singleton implements Serializable{

	SPRING{

		@Override
		public void say(String message) {
			System.err.println(message);
		}
		
	};
	
	public abstract void say(String message);
}
