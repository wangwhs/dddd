package cn.com.pep.model.decarator.impl2;
/**
 * 
 * @Title: Rectangle  具体构件角色（ConcreteComponent），被装饰的对象
 * @Description:  
 * @author wwh 
 * @date 2022-9-1 16:13:36
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.err.println("Shape: Recatangle.");
	}

}
