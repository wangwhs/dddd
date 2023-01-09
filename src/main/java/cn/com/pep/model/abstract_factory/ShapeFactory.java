package cn.com.pep.model.abstract_factory;

/**
 * 
 * @Title: ShapeFactory
 * @Description:
 * @author wwh
 * @date 2022-8-24 10:11:11
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if ("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		}

		if ("square".equalsIgnoreCase(shape)) {
			return new Square();
		}

		if ("rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}
		return null;
	}

}
