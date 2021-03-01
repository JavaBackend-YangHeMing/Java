package com.animal.AllClass;

public class Cat extends Animal {
	public Cat(String name,String speak) {
		this.name=name;
		this.speak=speak;
	}
	@Override
	public String cry() {
		// TODO Auto-generated method stub
		System.out.println(this.speak);
		return this.speak;
	}

	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		return this.name;
	}
	public void catchMouse() {
		System.out.println("I can 抓老鼠");
	}

}
