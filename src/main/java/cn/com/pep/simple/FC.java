package cn.com.pep.simple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FC {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(5);
		final long waitTime = 8 * 1000;
		final long awaitTime = 5 * 1000;

		Runnable task1 = new Runnable() {
			public void run() {
				try {
					System.out.println("task1 start");
					Thread.sleep(waitTime);
					System.out.println("task1 end");
				} catch (InterruptedException e) {
					System.out.println("task1 interrupted: " + e);
				}
			}
		};

		Runnable task2 = new Runnable() {
			public void run() {
				try {
					System.out.println("  task2 start");
					Thread.sleep(1000);
					System.out.println("  task2 end");
				} catch (InterruptedException e) {
					System.out.println("task2 interrupted: " + e);
				}
			}
		};
		// ��ѧ�����ĳ�����ѵ�����
		pool.execute(task1);

		// ��ѧ�����ܶ�����
		for (int i = 0; i < 1000; ++i) {
			pool.execute(task2);
		}

		try {
			// ��ѧ�������������Ϻ������ʾ�⣡��
			pool.shutdown();

			// ��ѧ�����XX��֮�ڽ���������ȫ������ȥ��Ϊ�κ���ҵ��������ʦ�ȴ�ѧ������
			// (���е����񶼽�����ʱ�򣬷���TRUE)
			if (!pool.awaitTermination(awaitTime, TimeUnit.MILLISECONDS)) {
				// ��ʱ��ʱ�����̳߳������е��̷߳����ж�(interrupted)��
				pool.shutdownNow();
			}
		} catch (InterruptedException e) {
			// awaitTermination�������жϵ�ʱ��Ҳ��ֹ�̳߳���ȫ�����̵߳�ִ�С�
			System.out.println("awaitTermination interrupted: " + e);
			pool.shutdownNow();
		}

		System.out.println("end");
	}

}
