package cn.com.pep.model.decarator.impl2;
/**
 * 
 * @Title: ShapeDecorator  
 * @Description:  抽象装饰角色(Decorator),定义一组与抽象构件角色相同的行为，
 * 				     通过实现接口来定义，并持有一个具体构件角色的引用，在完成装饰设计模式增加的功能之后再调用原有功能
 * @author wwh 
 * @date 2022-9-1 16:16:42
 */
public abstract class ShapeDecorator implements Shape{
	
	private Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
	}

}
