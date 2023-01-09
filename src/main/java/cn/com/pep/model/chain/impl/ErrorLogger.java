package cn.com.pep.model.chain.impl;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	public void write(String msg) {
		System.err.println("ERROR Logger: " + msg);
	}
}
