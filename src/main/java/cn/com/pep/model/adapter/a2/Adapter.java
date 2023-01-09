package cn.com.pep.model.adapter.a2;
/**
 * 
 * @Title: Adapter  
 * @Description:  类适配器，继承了需要适配的类，并且实现了目标对象的接口
 * @author wwh 
 * @date 2022-9-5 15:59:37
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void calculate() {
		specificRequest();
	}

}
