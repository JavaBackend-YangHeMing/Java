package com.extend.entity;

public class Teacher extends people {
//成员变量：工号
	String workNo;
	void teach() {
		System.out.println("上课");
	}
	/**
	 * 权限从高到低 类
	 * public：非本包非子类、非本包子类、同包类、类
	 * protected：非本包子类、同包类、类
	 * default：同包类、类
	 * private：类
	 */
	public Teacher() {
		System.out.println("Teacher无参构造方法");
	}
}
