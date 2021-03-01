package com.money.Allclass;

public class company{
	 
		public void all(Employee[] employee) {
			double allmoney=0;
			for(int i=0;i<employee.length;i++) {
				allmoney=allmoney+employee[i].earnings();
			}
			System.out.println("公司总共支出薪水为："+allmoney+"W");
		}

		}

