package cn.com.pep.model.abstract_factory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		// ��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// ��ȡ��״Ϊ Circle �Ķ���
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����
		shape1.draw();

		// ��ȡ��״Ϊ Rectangle �Ķ���
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ��״Ϊ Square �Ķ���
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();

		// ��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// ��ȡ��ɫΪ Red �Ķ���
		Color color1 = colorFactory.getColor("RED");

		// ���� Red �� fill ����
		color1.fill();

		// ��ȡ��ɫΪ Green �Ķ���
		Color color2 = colorFactory.getColor("GREEN");

		// ���� Green �� fill ����
		color2.fill();

		// ��ȡ��ɫΪ Black �Ķ���
		Color color3 = colorFactory.getColor("Black");

		// ���� Black �� fill ����
		color3.fill();
	}
}
