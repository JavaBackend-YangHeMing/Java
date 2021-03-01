package com.people.thisClass;

public abstract class People {
	protected double height;
	protected double weight;
	//抽象方法 关键字：abstract，  没有方法体
	public abstract void Sex();
	public void speakHello() {
		System.out.println("全世界的人会说你好！");
	}
	public void averageHeight() {
		height=175.0;
		System.out.println("全球人的平均身高是："+height+"cm");
	}
	public void averageWeight() {
		weight=70.0;
		System.out.println("全球人的平均体重是："+weight+"KG");
	}
}
