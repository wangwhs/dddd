package cn.com.pep.model.flyweight;

/**
 * 
 * @Title: AbstaractBox
 * @Description: Flyweight:抽象享元角色，声明了具体享元角色中的方法，向外界提供享元对象的内部状态，同时也可以通过这些方法来设置对象的外部状态
 * @author wwh
 * @date 2022-9-13 14:14:22
 */
public abstract class AbstaractBox{

	/**
	 * @Title: getShape
	 * @Description: 向外界提供享元对象的内部状态，即形状。
	 * @return
	 */
	public abstract String getShape();

	/**
	 * @Title: display
	 * @Description: 通过此方法来设置对象的外部状态
	 * @param color
	 */
	public void display(String color) {
		System.err.println("本次落下来的图形是：" + this.getShape() + ",颜色是：" + color);
	}

}
