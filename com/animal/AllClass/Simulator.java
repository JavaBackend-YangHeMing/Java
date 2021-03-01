package com.animal.AllClass;

public class Simulator{
		  public void playSound(Animal animal){
		       System.out.println("我是"+animal.getAnimalName());
		       System.out.println("我的叫声是:");
		       animal.cry();
		       
		  }
}

