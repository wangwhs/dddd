package cn.com.pep.model.builder;
/**
 * 
 * @Title: Cocacola  
 * @Description:  
 * @author wwh 
 * @date 2022-8-26 9:27:16
 */
public class Cocacola extends ColdDrink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Cocacola";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 2.0f;
	}

}
