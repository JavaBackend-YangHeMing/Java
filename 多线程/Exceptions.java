package 多线程;

import java.util.Scanner;

public class Exceptions{
	String[] students = { "zhangsan", "lisi", "wangwu", "maliu" };
		public static void main(String[] args) {
		queryStudent b = new queryStudent();
		b.run();
		Exceptions a = new Exceptions();
		System.out.println("【学生列表！】");
		a.listStudents();
		a.addStudent();
	}

	private void listStudents() {
		for(String name:students) {
			System.out.println(name);
		}
	}

	void addStudent() {

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("【添加学生】请输入学生姓名：");
		for (int i = 0; i < students.length; i++) {
			String name = reader.next();
			students[i] = name;
			System.out.println("新增学生" + name + "成功");
		}
		System.out.println("输入结束");

	}
	
	
}
