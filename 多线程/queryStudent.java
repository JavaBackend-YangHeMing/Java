package 多线程;

import java.util.Scanner;

public class queryStudent implements Runnable {

	String[] students = { "zhangsan", "lisi", "wangwu", "maliu" };
	queryStudent(){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);

		while (true) {
			System.out.println("【查询学生】请输入学号：");
			int count = reader.nextInt();
			String select = students[count];
			System.out.println("学号" + count + "的学生姓名是" + select);
			System.out.println("本次查询结束");
			break;
		}
	}
	@Override
	public void run() {
		System.out.println();
		
	}

}
