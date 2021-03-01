package com.people.thisClass;

public class ChinaPeople extends People {
	protected double height;
	protected double weight;
	
	public void speakHello() {
		System.out.println("中国人会说你好！");
	}
	public void averageHeight() {
		height=170.0;
		System.out.println("中国人的平均身高是"+height+"cm");
	}
	public void averageWeight() {
		weight=65.0;
		System.out.println("中国人的平均体重是"+weight+"KG");
	}
	public void chinaGongfu() {
		System.out.println("中国人会中国功夫");
	}
	@Override
	public void Sex() {
		System.out.println("男");
		
	}
}
