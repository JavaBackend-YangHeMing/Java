package com.jiekou;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(IMachine.brand);
		Machine Cat1 = new Machine();
		Cat1.keyOn();
		Cat1.Cry();
		Cat1.write();
		//接口回调：可理解为向上转型      把实现接口的类对象赋值给该接口引用
	}

}
