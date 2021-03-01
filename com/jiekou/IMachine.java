package com.jiekou;
//接口不能实例化
//jdk1.8:允许接口有普通方法，前一定要加default关键字；接口可定义静态方法和方法体
//抽象类和接口都不能实例化
public interface IMachine {
	abstract void read();
	abstract void write();
	String brand="JC娱乐场";//接口里没有变量，只有常量		
	public abstract void keyOn();
	default void keyoff() {
		
	}
}
