package com.money.Allclass;

public class YearWorker extends Employee {
	public YearWorker(double money,double Year) {
		this.money = money;
		this.Year = Year;
	}
	public double earnings() {
		return this.money*Year;
	}

}
