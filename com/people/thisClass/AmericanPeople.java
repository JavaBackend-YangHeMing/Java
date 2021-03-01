package com.people.thisClass;

public class AmericanPeople extends People {
	protected double height;
	protected double weight;
	
	public void speakHello() {
		System.out.println("美国人会说Hello！");
	}
	public void averageHeight() {
		height=176.0;
		System.out.println("美国人的平均身高是"+height+"cm");
	}
	public void averageWeight() {
		weight=75.0;
		System.out.println("美国人的平均体重是"+weight+"KG");
	}
	public void americanBoxing() {
		System.out.println("美国人热爱拳击");
	}
	@Override
	public void Sex() {
		System.out.println("女");
		
	}
}
