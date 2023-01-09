package cn.com.pep.model.singleton.single3;

/**
 * 
 * @Title: Singleton
 * @Description:����ʽ����
 * @author wwh
 * @date 2022-8-24 15:45:01
 */
public class Singleton {
	/**
	 * �Ƿ��������أ���
	 * �Ƿ��̰߳�ȫ����
	 * ʵ���Ѷȣ�����
	 * �������Ƚϳ��ã��������ײ�����������
	 * �ŵ㣺û�м�����ִ��Ч�ʻ���ߣ�
	 * ȱ�㣺�����ʱ��ͻ��ʼ�����˷��ڴ棻
	 * ������classloader���Ʊ����˶��߳�ͬ�������⣬������instance����װ�ص�ʱ���ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ���getInstance��
	 * ��Ҳ��ȷ����������ʽ��������أ���ʱ���û�дﵽ�����ص�Ч����
	 */
	
	private static Singleton instance = new Singleton();

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		return instance;
	}

}
