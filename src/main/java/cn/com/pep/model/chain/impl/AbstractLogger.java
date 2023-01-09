package cn.com.pep.model.chain.impl;

public abstract class AbstractLogger {
	
	public static int DEBUG = 1;
	
	public static int INFO = 2;
	
	public static int ERROR = 3;
	
	protected int level;
	
	private AbstractLogger nextLogger;
	
	/**
	 * @Title: setNextLogger 
	 * @Description:  
	 * @param logger
	 */
	public AbstractLogger setNextLogger(AbstractLogger logger) {
		this.nextLogger = logger;
		return logger;
	}
	
	/**
	 * @Title: loggerMsg 
	 * @Description:  
	 * @param level
	 * @param logger
	 */
	public void loggerMsg(int level,String msg) {
		if (level <= this.level) {
			write(msg);
		}
		
		if (nextLogger != null) {
			nextLogger.loggerMsg(level, msg);
		}
	}
	
	/**
	 * @Title: write 
	 * @Description:  
	 * @param msg
	 */
	public abstract void write(String msg);

}
