package cn.com.pep.model.singleton.single4;

/**
 * 
 * @Title: Singleton
 * @Description:˫��У����
 * @author wwh
 * @date 2022-8-24 16:02:19
 */
public class Singleton {
	
	/**
	 * �Ƿ��������أ���
	 * �Ƿ���̰߳�ȫ����
	 * ʵ���Ѷȣ��ϸ���
	 * ���������ַ�ʽ������˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܣ�
	 */
	
	private volatile static Singleton instance;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
