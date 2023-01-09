package cn.com.pep.dynamic;

/**
 * 单分派、 多分派演示
 * 
 * @author zzm
 */
public class Dispatch {
	static class QQ {
	}

	static class _360 {
	}

	public static class Father {
		public void hardChoice(QQ arg) {
			System.out.println("father choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("father choose 360");
		}
		
	}

	public static class Son extends Father {
		public void hardChoice(QQ arg) {
			System.out.println("son choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("son choose 360");
		}
	}

	void cantBeZero(int i) throws Exception {
			throw new Exception();
	}

	public static void main(String[] args) {
		Father father = new Father();
		Father son = new Son();
		father.hardChoice(new _360());
		father.hardChoice(new QQ());
		son.hardChoice(new QQ());
	}
}