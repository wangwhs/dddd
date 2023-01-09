package cn.com.pep.model.flyweight;

/**
 * 
 * @Title: FlyweightPatternDemo  
 * @Description:  ������
 * @author wwh 
 * @date 2022-9-13 14:36:49
 */
public class FlyweightPatternDemo {
	
	public static void main(String[] args) {
		BoxFactory factory = BoxFactory.getFactory();
		AbstaractBox box = factory.getBox("I");
		box.display("��ɫ");//�����ⲿ״̬--��ɫ
		box.display("��ɫ");
		
		System.err.println(box);//��ӡ���ڲ�״̬��
		factory.getBox("I");
		System.err.println(box);//�ٴδ�ӡ���ڲ�״̬��
	}
}
