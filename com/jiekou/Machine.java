package com.jiekou;

public class Machine implements IMachine,ICry{

	@Override
	public void read() {
		System.out.println("把机器猫拷贝电脑");
		
	}

	@Override
	public void write() {
		System.out.println("把故事考到机器猫上");
	}

	@Override
	public void keyOn() {
		System.out.println("打开机器猫");
		
	}

	@Override
	public void Cry() {
		System.out.println("喵喵喵");
		
	}

}
