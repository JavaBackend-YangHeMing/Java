package com.duotai;

public class A {
	public String show(D obj) {
		return ("A and D");
	}
	public String show(A obj) {
		return ("A and A");
	}
	public String show(int obj) {
		return ("A and D");
	}
}
