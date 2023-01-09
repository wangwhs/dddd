package cn.com.pep.model.prototype;

/**
 * 
 * @Title: Circle
 * @Description:
 * @author wwh
 * @date 2022-8-25 16:51:33
 */
public class Circle extends Shape {

	public Circle() {
		type = "circle";
	}

	@Override
	public void draw() {
		System.err.println("Draw a Circle!");
	}

}
