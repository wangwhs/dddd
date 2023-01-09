package cn.com.pep.invoke;

public class T {

	public static void main(String[] args) {
		Father test = new Son();
		test.fMe();
	}
}

class Father {

	public void fMe() {
		System.err.println("fMe");
		fMe1();
		System.err.println(this);
		this.fMe1();
	}

	private void fMe1() {
		System.err.println("fme1");
	}

}

class Son extends Father {

	public void fMe1() {
		System.out.println("sMe1");
	}
}
