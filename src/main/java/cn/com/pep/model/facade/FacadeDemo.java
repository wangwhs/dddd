package cn.com.pep.model.facade;

import cn.com.pep.model.facade.impl.ShapeMarker;

/**
 * @Title: FacadeDemo  
 * @Description:外观模式对外暴露一个接口，用来隐藏系统的复杂性。这种模式涉及到了一个单一的类，该类提供了一个客户端请求的简化方法和对现有系统类方法的委托调用。
 * 				意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层的接口，这个接口使得对系统的使用更加简单。
 * 				何时使用：1、客户端不需要知道系统的复杂性，系统只需要提供一个“接待员”即可；2、定义系统的入口；
 * 				如何解决：1、客户端不和系统耦合，外观类和系统耦合；
 * 				关键代码：客户端和复杂系统之间再加一层，这一层将调用顺序和依赖关系处理好；
 * 				应用实例：1、去医院看病，可能需要挂号、划价、取药，让患者觉得很麻烦，如果有接待人员，让接待人员来处理，就很方便；2、JAVA的三层开发模式；
 * 				优点：1、减少系统的相互依赖；2、提高灵活性；3、提高了安全性；
 * 				缺点：不符合开闭原则，如果要修改东西很麻烦，继承和重写都不适合；
 * 				使用场景：1、为复杂的模块或者子系统提供外界访问的模块；2、子系统相对独立；3、预防低水平的人员带来的风险；
 * @author wwh 
 * @date 2022-6-23 10:01:25
 */
public class FacadeDemo {
	
	public static void main(String[] args) {
		ShapeMarker marker = new ShapeMarker();
		marker.drawCircle();
		marker.drawRectangle();
		marker.drawSquare();
	}

}
