package javaCommand;

/**
 * @author hollis
 */
public class JStackDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new DeadLockclass(true));// ����һ���߳�
		Thread t2 = new Thread(new DeadLockclass(false));// ������һ���߳�
		t1.start();// ����һ���߳�
		t2.start();// ������һ���߳�
	}
}

class DeadLockclass implements Runnable {
	public boolean falg;// �����߳�

	DeadLockclass(boolean falg) {
		this.falg = falg;
	}

	public void run() {
		/**
		 * ���falg��ֵΪtrue�����t1�߳�
		 */
		if (falg) {
			while (true) {
				synchronized (Suo.o1) {
					System.out.println("o1 " + Thread.currentThread().getName());
					synchronized (Suo.o2) {
						System.out.println("o2 " + Thread.currentThread().getName());
					}
				}
			}
		}
		/**
		 * ���falg��ֵΪfalse�����t2�߳�
		 */
		else {
			while (true) {
				synchronized (Suo.o2) {
					System.out.println("o2 " + Thread.currentThread().getName());
					synchronized (Suo.o1) {
						System.out.println("o1 " + Thread.currentThread().getName());
					}
				}
			}
		}
	}
}

class Suo {
	static Object o1 = new Object();
	static Object o2 = new Object();
}