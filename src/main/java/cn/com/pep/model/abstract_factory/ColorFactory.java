package cn.com.pep.model.abstract_factory;
/**
 * 
 * @Title: ColorFactory  
 * @Description:  
 * @author wwh 
 * @date 2022-8-24 10:27:18
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if ("red".equalsIgnoreCase(color)) {
			return new Red();
		}
		
		if ("green".equalsIgnoreCase(color)) {
			return new Green();
		}
		
		if ("black".equalsIgnoreCase(color)) {
			return new Black();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
