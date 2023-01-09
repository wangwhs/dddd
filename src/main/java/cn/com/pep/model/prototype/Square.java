package cn.com.pep.model.prototype;

/**
 * 
 * @Title: Square
 * @Description:
 * @author wwh
 * @date 2022-8-25 16:53:52
 */
public class Square extends Shape {

	public Square() {
		type = "square";
	}

	@Override
	public void draw() {
		System.err.println("Draw a Square!");
	}

}
