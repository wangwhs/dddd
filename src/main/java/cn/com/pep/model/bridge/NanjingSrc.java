package cn.com.pep.model.bridge;
/**
 * @Title: NanjingSrc  
 * @Description:  �������󻯽�ɫ��RefinedAbstraction��:��չ���󻯽�ɫ���ı������������󻯽�ɫ�Ķ��壻
 * @author wwh 
 * @date 2022-9-9 11:11:44
 */
public class NanjingSrc extends AbstractSrc{

	public NanjingSrc(Bridge bridge) {
		super(bridge);
	}

	@Override
	public void src() {
		System.err.println("�������Ͼ�......");
	}

}
