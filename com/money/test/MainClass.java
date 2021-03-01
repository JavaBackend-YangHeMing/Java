package com.money.test;
import java.util.Scanner;

import com.money.Allclass.*;
public class MainClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("*****输入YearWorker领取年数*****   ：");
		Employee YearWorker = new YearWorker(12.00,scan.nextDouble());
		System.out.print("*****输入MonthWorker领取月数*****   ：");
		Employee MonthWorker = new MonthWorker(1.00,scan.nextDouble());
		System.out.print("*****输入WeekWorker领取周数*****   ：");
		Employee WeekWorker = new WeekWorker(0.25,scan.nextDouble());
		Employee[] employee = new Employee[3];
		employee[0]=YearWorker;
		employee[1]=MonthWorker;
		employee[2]=WeekWorker;
		 //Employee lingdao1 = new YearWorker(1,1);
		 //Employee lingdao2 = new YearWorker(2,2);
		 //Employee yuangong1 = new MonthWorker(1,1);
		 //Employee yuangong2 = new MonthWorker(2,2);
		 //Employee lingshigong1 = new WeekWorker(1,1);
		 //Employee lingshigong2 = new WeekWorker(2,2);
		 //Employee[] employee = {lingdao1,lingdao2,yuangong1,yuangong2,lingshigong1,lingshigong2};
		company x = new company();
		x.all(employee);
		}		
	}


