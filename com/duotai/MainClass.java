package com.duotai;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
        //A and A
		System.out.println("1--" + a1.show(b));
		//A and A
		System.out.println("2--" + a1.show(c));
		//A and D
		System.out.println("3--" + a1.show(d));
		//B and A
		System.out.println("4--" + a2.show(b));
        //B and A
		System.out.println("5--" + a2.show(c));
		//A and D
		System.out.println("6--" + a2.show(d));
		//B and B
		System.out.println("7--" + b.show(b));
		//B and B
		System.out.println("8--" + b.show(c));
		//A and D
		System.out.println("9--" + b.show(d));
	}
	}

