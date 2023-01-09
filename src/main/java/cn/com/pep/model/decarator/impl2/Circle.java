package cn.com.pep.model.decarator.impl2;
/**
 * 
 * @Title: Circle  
 * @Description:  具体构件角色（ConcreteComponent），被装饰的对象
 * @author wwh 
 * @date 2022-9-1 16:14:50
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.err.println("Shape: Circle.");
	}

}
