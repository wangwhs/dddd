package cn.com.pep.model.prototype;
/**
 * 
 * @Title: PrototypePatternDemo  
 * @Description:  
 * @author wwh 
 * @date 2022-8-25 17:02:02
 */
public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("circle");
		System.err.println(circle);
		
		Shape square = ShapeFactory.getShape("square");
		System.err.println(square);
		
		Shape rectangle = ShapeFactory.getShape("rectangle");
		System.err.println(rectangle);
	}

}
