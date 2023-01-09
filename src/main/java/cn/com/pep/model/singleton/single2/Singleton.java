package cn.com.pep.model.singleton.single2;
/**
 * 
 * @Title: Singleton  
 * @Description: �̰߳�ȫ������ʽ 
 * @author wwh 
 * @date 2022-8-24 15:07:07
 */
public class Singleton {
	
	/**
	 * �Ƿ��������أ���
	 * �Ƿ��̰߳�ȫ����
	 * ʵ���Ѷȣ�����
	 * ���������ַ�ʽ�߱��ܺõ�lazy loading���ܹ��ڶ��߳��кܺõĹ���������Ч�ʱȽϵͣ�99%����²���Ҫͬ����
	 * �ŵ㣺��һ�ε��òų�ʼ�����������ڴ���˷ѣ�
	 * ȱ�㣺�������synchronized���ܱ�֤��������������Ӱ��Ч�ʣ�
	 */
	
	private static Singleton instance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

}
