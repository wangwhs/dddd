package cn.com.pep.model.strategy;

public class OperationMultiply implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
