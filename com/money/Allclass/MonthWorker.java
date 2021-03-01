package com.money.Allclass;

public class MonthWorker extends Employee {
	public MonthWorker(double money,double Month) {
		this.money =money;
		this.Month=Month;
	}
	@Override
	public double earnings() {
		return this.money*Month;
	}

}
