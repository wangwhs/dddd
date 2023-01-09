package cn.com.pep.model.proxy.staticproxy;

/**
 * 
 * @Title: ProxySubject
 * @Description: ������ʵ���˴���ӿ�
 * @author wwh
 * @date 2022-9-2 15:47:35
 */
public class ProxySubject implements Subject {

	/**
	 * ����һ��ί���������
	 */
	private Subject delegate;

	public ProxySubject(Subject delegate) {
		this.delegate = delegate;
	}

	/**
	 * ����������ί����ִ�У���¼����ִ��ǰ���ʱ��
	 */
	@Override
	public void caculate() {
		// TO DO Auto-generated method stub
		long begin = System.currentTimeMillis();
		delegate.caculate();
		long end = System.currentTimeMillis();
		System.err.println("�ܹ���ʱ��" + (end - begin) + "����");

	}

}
