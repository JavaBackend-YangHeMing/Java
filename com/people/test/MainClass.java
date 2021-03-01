package com.people.test;
import com.people.thisClass.*;
public class MainClass {
	public static void main(String[]args) {
		System.out.println("      People测试         ");
		System.out.println("***************************");
		AmericanPeople jack = new AmericanPeople();
		jack.speakHello();
		jack.averageHeight();
		jack.averageWeight();
		jack.americanBoxing();
		System.out.println("***************************");
		ChinaPeople NB=new ChinaPeople();
		NB.speakHello();
		NB.averageHeight();
		NB.averageWeight();
		NB.chinaGongfu();
		System.out.println("***************************");
		BeijingPeople Hu = new BeijingPeople();
		Hu.chinaGongfu();
		Hu.averageHeight();
		Hu.averageWeight();
		Hu.beijingOpera();
	}
}
