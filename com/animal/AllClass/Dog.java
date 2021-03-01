package com.animal.AllClass;

public class Dog extends Animal{
	public Dog(String name,String speak) {
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

}
