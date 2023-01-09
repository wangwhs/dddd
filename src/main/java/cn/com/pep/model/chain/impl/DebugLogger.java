package cn.com.pep.model.chain.impl;

public class DebugLogger extends AbstractLogger{
	
	public DebugLogger(int level) {
		this.level = level;
	}

	@Override
	public void write(String msg) {
		System.err.println("Debug Logger: " + msg);
	}

}
