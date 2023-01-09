package cn.com.pep.model.chain;

import cn.com.pep.model.chain.impl.AbstractLogger;
import cn.com.pep.model.chain.impl.DebugLogger;
import cn.com.pep.model.chain.impl.ErrorLogger;
import cn.com.pep.model.chain.impl.InfoLogger;

/**
 * @Title: ChainResponsibility  
 * @Description:为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦，这种设计模式属于行为型设计模式。
 * 				这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么会把相同的请求传递给下一个接收者，依次类推。
 * 				意图：避免请求发送者和接收者耦合在一起，让多个对象都可能接受请求，将这些对象连接成一条链，并沿着这条链传递请求，知道没有对象处理它位置。
 * 				主要解决：职责链上的处理者负责处理请求，客户端只需要将请求发送到职责链上即可，无需关心请求的处理细节和请求的传递，所以责任链将请求的发送者和请求的处理着进行解耦了。
 * 				何时使用：在处理消息的时候可以过滤很多道。
 * 				如何解决：拦截的类都实现统一的接口
 * 				关键代码：Handler里面聚合它自己，在HandlerRequest里面判断是否合适，如果没有达到条件则向下传递，直到没有请求处理者为止
 * 				优点： 1、降低了耦合度，将请求的发送者和接收者进行了解耦；
 * 					 2、增强给对象指派职责的灵活性，通过改变链内的成员或者调动他们的次序，允许动态的新增或者删除责任；
 * 					 3、增加新的请求处理类很方便；
 * 				缺点： 1、不能保证请求一定被接收；
 * 					 2、系统性能受到一定影响，调试不方便，可能造成循环调用；
 * 				     3、可能不容易观察运行时候得特征，有碍排除错误。
 * 				应用实例：1、击鼓传花；2、js中的冒泡时间；3、tomcat中对encoding的处理；4、structs中的过滤器；
 * 				应用场景：1、有多个对象可以处理一个请求，具体哪些对象处理这个请求由运行时动态确定；2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求；3、可以动态指定一组对象处理一个请求；
 * @author wwh 
 * @date 2022-6-20 14:06:05
 */
public class ChainResponsibility {

	public static void main(String[] args) {
		AbstractLogger logger = getLoggerChains();
		logger.loggerMsg(AbstractLogger.DEBUG, "Mine major is java...");
	}
	
	public static AbstractLogger getLoggerChains() {
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		debugLogger.setNextLogger(infoLogger).setNextLogger(errorLogger);
		return debugLogger;
	}
}
