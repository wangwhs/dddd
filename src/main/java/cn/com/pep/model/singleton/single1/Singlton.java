package cn.com.pep.model.singleton.single1;
/**
 * 
 * @Title: Singlton  
 * @Description:  ����ʽ����
 * @author wwh 
 * @date 2022-8-24 15:03:44
 */
public class Singlton {
	/**
	 * �Ƿ������أ���
	 * �Ƿ���̰߳�ȫ���񣬲�֧�ֶ��̣߳������ϸ��������������ǵ���ģʽ
	 * ʵ�����׳̶ȣ���
	 */
	
	private static Singlton instance;
	
	private Singlton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singlton getInstance() {
		if (instance == null) {
			instance = new Singlton();
		}
		return instance;
	}
}
