package cn.com.pep.thread;
/**
 * @Title: RunnableDemo  
 * @Description:  
 * @author wwh 
 * @date 2022-8-17 9:54:08
 */
public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.err.println("I am RunnableDemo");
	}
	
	public static void main(String[] args) {
		Thread demo = new Thread(new RunnableDemo());
		demo.start();
	}

}
