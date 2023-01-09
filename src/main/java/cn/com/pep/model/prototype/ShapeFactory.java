package cn.com.pep.model.prototype;

import java.util.Hashtable;

/**
 * 
 * @Title: ShapeFactory
 * @Description:
 * @author wwh
 * @date 2022-8-25 16:56:33
 */
public class ShapeFactory {

	private static Hashtable<String, Shape> t = new Hashtable<>();
	
	/**
	 * 类加载的时候通过静态块完成原型对象的初始化
	 */
	static {
		Circle circle = new Circle();
		t.put("circle", circle);
		Square square = new Square();
		t.put("square", square);
		Rectangle rectangle = new Rectangle();
		t.put("rectangle", rectangle);
	}
	
	public static Shape getShape(String type) {
		Shape clone = null;
		try {
			Shape shape = t.get(type);
			clone = (Shape) shape.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}


}
