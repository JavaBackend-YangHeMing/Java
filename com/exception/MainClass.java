package com.exception;

public class MainClass {
	public static void main(String[] args){
		Machine machine = new Machine();
		String[] name = { "吃的", "罂粟", "穿的", "毒药", "娃哈哈", "情报" };
		Goods[] goods = new Goods[name.length];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new Goods();
			if(i % 2 == 0){
				goods[i].setDanger(false);
				goods[i].setName(name[i]);
			} else {
				goods[i].setDanger(true);
				goods[i].setName(name[i]);
			}
		}
		for (int i = 0; i < goods.length; i++) {
			try {
				machine.checkBag(goods[i]);
				System.out.println(goods[i].getName() + "  不属于危险品");
			} catch (DangerException e) {
				System.out.print(goods[i].getName());
				e.toShow();
			}
		}
 
	}
 
}
