package com.duotai;

public class B extends A{
	public String show(B obj) {
		return ("B and B");
	}

	@Override
	public String show(A obj) {
		return ("B and A");
	}

	@Override
	public String show(D obj) {
		return super.show(obj);
	}
}
