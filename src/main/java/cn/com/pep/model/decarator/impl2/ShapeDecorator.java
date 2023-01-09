package cn.com.pep.model.decarator.impl2;
/**
 * 
 * @Title: ShapeDecorator  
 * @Description:  ����װ�ν�ɫ(Decorator),����һ������󹹼���ɫ��ͬ����Ϊ��
 * 				     ͨ��ʵ�ֽӿ������壬������һ�����幹����ɫ�����ã������װ�����ģʽ���ӵĹ���֮���ٵ���ԭ�й���
 * @author wwh 
 * @date 2022-9-1 16:16:42
 */
public abstract class ShapeDecorator implements Shape{
	
	private Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
	}

}
