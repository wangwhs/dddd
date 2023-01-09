package cn.com.pep.model.singleton.single6;

import java.io.Serializable;

public class BBB implements Serializable{
	
	private BBB() {
		
	}
	
	public Object readResolve() {
		return 222;
	}

}
