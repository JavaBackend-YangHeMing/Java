package com.money.Allclass;

public class WeekWorker extends Employee {
	public WeekWorker(double money,double Week) {
		this.money=money;
		this.Week=Week;
	}
	@Override
	public double earnings() {
		return this.money*Week;
	}

}
