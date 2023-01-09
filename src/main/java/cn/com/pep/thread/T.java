package cn.com.pep.thread;

public class T {
	
	public static void main(String[] args) {
		System.err.println(test1());
	}
	
	public static int test1() {
	    int x = 1;
	    try {
	        return x;
	    } finally {
	        x = 2;
	    }
	}
}
