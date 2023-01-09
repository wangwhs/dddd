package cn.com.pep.thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.err.println("hello world!");
			}
		});
		
		t.start();
	}
}
