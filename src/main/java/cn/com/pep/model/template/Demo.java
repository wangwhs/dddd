package cn.com.pep.model.template;

import cn.com.pep.model.template.impl.BasketBall;
import cn.com.pep.model.template.impl.FootBall;
import cn.com.pep.model.template.impl.Game;

/**
 * @Title: Demo  
 * @Description: 策略模式，定义了一组算法，将每个算法都封装起来，并且使他们之间都可以互换。
 * 				  模板方法，模板的价值就在于骨架的定义，骨架内部将问题处理的流程定义好，通用的逻辑由父类实现，个性化的逻辑由子类实现。
 * @author wwh 
 * @date 2022-7-12 10:37:58
 */
public class Demo {
	/**
	 * 一个抽象类中，公开定义了执行它的方法的方式。他的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行，这种设计模式属于行为型的设计模式。
	 * 意图：定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
	 * 主要解决：一些通用方法，却在每一个子类都重写了这一方法。
	 * 何时使用：有一些通用的方法。
	 * 如何解决：将这些通用方法抽象出来。
	 * 关键代码：通用方法在抽象类实现，其他步骤在子类实现。
	 *优点：1、封装不可变部分，扩展可变部分；2、提取公共代码，便于维护；3、行为由父类控制，子类实现。
	 *缺点：每一个不同实现都需要一个子类来实现，导致系统中类的个数增加，系统变得更加庞大。
	 *使用场景：1、有多个子类共有的方法，并且逻辑相同，可以考虑模板方法；2、重要的，复杂的方法，可以考虑作为模板方法；
	 *注意事项：为了防止恶意操作，通常模板方法都定义为final.
	 */
	
	public static void main(String[] args) {
		Game football = new FootBall();
		football.play();
		Game basketball = new BasketBall();
		basketball.play();
	}
}
