package cn.com.pep.model.prototype;

/**
 * 
 * @Title: Rectangle
 * @Description:
 * @author wwh
 * @date 2022-8-25 16:55:02
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "rectangle";
	}

	@Override
	public void draw() {
		System.err.println("Draw a rectangle!");
	}

}
