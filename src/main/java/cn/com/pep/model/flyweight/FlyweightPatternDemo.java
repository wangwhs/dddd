package cn.com.pep.model.flyweight;

/**
 * 
 * @Title: FlyweightPatternDemo  
 * @Description:  测试类
 * @author wwh 
 * @date 2022-9-13 14:36:49
 */
public class FlyweightPatternDemo {
	
	public static void main(String[] args) {
		BoxFactory factory = BoxFactory.getFactory();
		AbstaractBox box = factory.getBox("I");
		box.display("红色");//传入外部状态--颜色
		box.display("白色");
		
		System.err.println(box);//打印“内部状态”
		factory.getBox("I");
		System.err.println(box);//再次打印“内部状态”
	}
}
