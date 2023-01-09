package cn.com.pep.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadPool {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws InterruptedException, TimeoutException{
		List list = new ArrayList<>();
		
		FutureTask<Object> futureTask = new FutureTask<>(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.err.println("hello world!");
					try {
						Thread.currentThread().wait(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}, null);
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(futureTask);
		try {
			futureTask.get(1, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e1) {
			executorService.shutdownNow();
			e1.printStackTrace();
		}
		
	}
}
