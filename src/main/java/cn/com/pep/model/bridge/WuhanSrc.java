package cn.com.pep.model.bridge;
/**
 * 
 * @Title: WuhanSrc  
 * @Description:  �������󻯽�ɫ��RefinedAbstraction��:��չ���󻯽�ɫ���ı������������󻯽�ɫ�Ķ��壻
 * @author wwh 
 * @date 2022-9-9 11:14:48
 */
public class WuhanSrc extends AbstractSrc{

	public WuhanSrc(Bridge bridge) {
		super(bridge);
	}

	@Override
	public void src() {
		System.err.println("�������人......");
	}

}
