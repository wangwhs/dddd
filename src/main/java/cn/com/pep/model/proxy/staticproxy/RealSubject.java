package cn.com.pep.model.proxy.staticproxy;
/**
 * 
 * @Title: RealSubject  
 * @Description:  ί���࣬ʵ�ֺ��ĵ�ҵ���߼�
 * @author wwh 
 * @date 2022-9-2 15:46:16
 */
public class RealSubject implements Subject{

	@Override
	public void caculate() {
		try {
			Thread.sleep(1000);
			System.err.println("����ί���࣬ʵ�ֺ��ĵ�ҵ���߼�");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
