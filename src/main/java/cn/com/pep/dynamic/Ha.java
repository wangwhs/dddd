package cn.com.pep.dynamic;

public class Ha {
	{
		System.out.println("hahahahhaha");
	}

	int c;

	public Ha() {
		int c = 2;
	}

	public Ha(int c) {
		this.c = c;
	}

	public static void main(String[] args) {
		new Ha(6);
		new Ha().foo();
	}

	private void foo() {
		Bar();
		System.out.println("tttttttttttt");
	}

	private void Bar() {
		System.out.println("aaaaaaaaaaaaaaaa");
	}
}