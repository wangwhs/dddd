package cn.com.pep.model.singleton.single5;

/**
 * @Title: Singleton
 * @Description: ��̬�ڲ���
 * @author wwh
 * @date 2022-8-24 16:12:51
 */
public class Singleton {
	
	/**
	 * �Ƿ��������أ���
	 * �Ƿ��Ƕ��̰߳�ȫ����
	 * ʵ���Ѷȣ�һ��
	 * ���������ַ�ʽ�ܴﵽ��˫������ʽһ���Ĺ�Ч��ʵ�ָ��򵥣�
	 * ���ַ�ʽͬ��������classloader��������֤ʵ����ʼ����ʱ��ֻ��һ���̣߳���������ʽ��ͬ���ǣ�
	 * �����ַ�ʽ��ֻҪSington�౻�����ˣ���ôinstanceʵ���ͻᱻ��ʼ����û�дﵽ�����ص�Ч����
	 * �����ַ�ʽ��ʹSingleton�౻�����ˣ�����SingletonHolder��û�б�����ʹ�ã�ֻ��ͨ����ʾ����
	 * getInstance()����ʱ�򣬲Ż���ʾ����SingletonHolder�࣬�Ӷ�ʵ����instance����
	 */

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
