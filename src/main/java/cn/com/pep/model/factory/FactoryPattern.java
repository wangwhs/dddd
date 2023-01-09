package cn.com.pep.model.factory;
/**
 * @Title: FactoryPattern  
 * @Description:  
 * @author wwh 
 * @date 2022-8-23 13:50:44
 */
public class FactoryPattern {
	
	public static void main(String[] args) {
		Factory factory = new FactoryA();
		factory.manufacture().show();
		factory = new FactoryB();
		factory.manufacture().show();
	}
}
