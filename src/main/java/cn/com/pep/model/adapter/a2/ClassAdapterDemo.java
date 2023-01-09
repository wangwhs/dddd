package cn.com.pep.model.adapter.a2;

/**
 * 
 * @Title: ClassAdapterDemo
 * @Description: 测试类
 * @author wwh
 * @date 2022-9-5 15:57:58
 */
public class ClassAdapterDemo {

	public static void main(String[] args) {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();// 实例化一个普通类
		concreteTarget.calculate();

		// 使用特殊功能类，即适配类
		Target adapter = new Adapter();
		adapter.calculate();

	}
}
