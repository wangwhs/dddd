package cn.com.pep.simple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(new TaskRunnable());
//		executorService.shutdown();
		executorService.awaitTermination(10, TimeUnit.SECONDS);
		executorService.shutdownNow();
		System.err.println("hello world!");
	}

	static class TaskRunnable implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(200000);
				System.err.println(Thread.currentThread().getName() + "--线程被调用了...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
