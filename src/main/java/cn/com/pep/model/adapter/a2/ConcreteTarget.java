package cn.com.pep.model.adapter.a2;
/**
 * 
 * @Title: ConcreteTarget  
 * @Description:  目标对象
 * @author wwh 
 * @date 2022-9-5 15:49:50
 */
public class ConcreteTarget implements Target{

	@Override
	public void calculate() {
		System.err.println("执行目标类的方法");
	}
}
