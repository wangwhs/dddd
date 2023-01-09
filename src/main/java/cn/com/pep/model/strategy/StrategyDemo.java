package cn.com.pep.model.strategy;

public class StrategyDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		int result = context.executeStrategy(5, 19);
		System.err.println(result);
		context = new Context(new OperationMultiply());
		int executeStrategy = context.executeStrategy(12, 19);
		System.err.println(executeStrategy);
	}
}
