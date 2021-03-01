package com.extend.test;
/**
 * 调用的类和当前类不在同一个包中的就需要import   *引入包中所有类
 */
import com.extend.entity.*;
//非同包非子类
public class MainClass{
	public static void main(String[]args) {
		Student X = new Student("1940220290","张三",20,180.0);
		X.eat();}
}
