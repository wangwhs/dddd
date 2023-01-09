package cn.com.pep.model.flyweight;

/**
 * 
 * @Title: AbstaractBox
 * @Description: Flyweight:������Ԫ��ɫ�������˾�����Ԫ��ɫ�еķ�����������ṩ��Ԫ������ڲ�״̬��ͬʱҲ����ͨ����Щ���������ö�����ⲿ״̬
 * @author wwh
 * @date 2022-9-13 14:14:22
 */
public abstract class AbstaractBox{

	/**
	 * @Title: getShape
	 * @Description: ������ṩ��Ԫ������ڲ�״̬������״��
	 * @return
	 */
	public abstract String getShape();

	/**
	 * @Title: display
	 * @Description: ͨ���˷��������ö�����ⲿ״̬
	 * @param color
	 */
	public void display(String color) {
		System.err.println("������������ͼ���ǣ�" + this.getShape() + ",��ɫ�ǣ�" + color);
	}

}
