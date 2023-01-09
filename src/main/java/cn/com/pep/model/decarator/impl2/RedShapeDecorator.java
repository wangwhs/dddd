package cn.com.pep.model.decarator.impl2;
/**
 * 
 * @Title: RedShapeDecorator  
 * @Description: 具体的装饰者类，负责给被装饰者类扩展功能； 
 * @author wwh 
 * @date 2022-9-1 16:55:38
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		super.draw();
		setRedColor();
	}
	
	private void setRedColor() {
		System.err.println("Red Color!");
	}

}
