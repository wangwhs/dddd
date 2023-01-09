package cn.com.pep.model.decarator.impl2;
/**
 * 
 * @Title: DecoratorPatternDemo  
 * @Description:  ≤‚ ‘¿‡
 * @author wwh 
 * @date 2022-9-1 16:56:54
 */
public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		Shape shape = new Rectangle();
		ShapeDecorator decorator = new RedShapeDecorator(shape);
		decorator.draw();
	}
}
