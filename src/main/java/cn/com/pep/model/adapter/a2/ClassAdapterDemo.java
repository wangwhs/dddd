package cn.com.pep.model.adapter.a2;

/**
 * 
 * @Title: ClassAdapterDemo
 * @Description: ������
 * @author wwh
 * @date 2022-9-5 15:57:58
 */
public class ClassAdapterDemo {

	public static void main(String[] args) {
		// ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();// ʵ����һ����ͨ��
		concreteTarget.calculate();

		// ʹ�����⹦���࣬��������
		Target adapter = new Adapter();
		adapter.calculate();

	}
}
