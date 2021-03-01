package com.people.thisClass;

public class BeijingPeople extends ChinaPeople {
	protected double height;
	protected double weight;
	
	public void speakHello() {
		System.out.println("北京人会说你好！");
	}
	public void averageHeight() {
		super.speakHello();
		height=174.0;
		System.out.println("北京人的平均身高是"+height+"cm");
	}
	public void averageWeight() {
		weight=68.0;
		System.out.println("北京人的平均体重是"+weight+"KG");
	}
	public void chinaGongfu() {
		System.out.println("北京人也会中国功夫");
	}
	public void beijingOpera() {
		System.out.println("北京人很爱北京戏剧");
	}

}
