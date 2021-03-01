package com.extend.entity;

public class Student extends people {
//子类自定义的属性
	String studentNo;//默认值:null
	static String schoolName;
	Subject subject;
	//自定义方法：上学
	
	void goToSchool() {
		System.out.println("去上学");
	}
	/**
	 * 子类要全部继承父类的所有东西
	 * 但是除了构造方法
	 * @param studentNo
	 * @param studentName
	 * @param age
	 * @param height
	 *
	 */
	public Student(String studentNo,String studentName,int age,double height){
		this.studentNo=studentNo;
		this.name=studentName;
		this.age=age;
		this.height=height;
	}
	public Student(){
		System.out.println("锦城学院的学生");
	}
}
