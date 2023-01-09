package cn.com.pep.threadlocal;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		cleanSomeSlots(1, 10);
	}

	private static boolean cleanSomeSlots(int i, int n) {
		boolean removed = false;
		do {
			if (true) {
				n = 16;
				removed = true;
			}
		} while ((n >>>= 1) != 0);
		return removed;
	}
}
