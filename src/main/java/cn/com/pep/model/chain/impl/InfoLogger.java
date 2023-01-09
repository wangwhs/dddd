package cn.com.pep.model.chain.impl;

public class InfoLogger extends AbstractLogger {

	public InfoLogger(int level) {
		this.level = level;
	}

	@Override
	public void write(String msg) {
		// TODO Auto-generated method stub
		System.err.println("INFO Logger: " + msg);
	}

}
