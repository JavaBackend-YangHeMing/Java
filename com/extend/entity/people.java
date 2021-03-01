package com.extend.entity;
//成员变量 成员方法 构造方法   类的访问权限只有两种：public default
public class people {

	String name;
	int age;
	double height;
	
	public void eat() {
		System.out.println("吃饭");
	}
	public people() {
		System.out.println("无参构造方法");
	}
}
