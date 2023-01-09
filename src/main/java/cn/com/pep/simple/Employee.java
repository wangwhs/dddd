package cn.com.pep.simple;

public class Employee extends Person {
	public static Integer totalNum = 0; // Ա����
	public int empNo; // Ա����� ����
	protected String position; // ְλ ����
	private int salary; // ���� ˽��

	public void sayHello() {
		System.out.println(String.format("Hello, ���� %s, ���� %s ��, ������%s, ��Ŀǰ�Ĺ�����%s, ����%sԪ\n", name, age, getHobby(),
				position, salary));
	}

	private void work() {
		System.out.println(String.format("My name is %s, ����������.", name));
	}

	public Employee(String name, String age, String hobby, int empNo, String position, int salary) {
		super(name, age, hobby);
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
		Employee.totalNum++;
	}
}