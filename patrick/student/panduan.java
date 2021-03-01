package patrick.student;

import java.util.Scanner;

public class panduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scanner = new Scanner(System.in);
				System.out.println("请输入分数：");
				double score = scanner.nextDouble();
				scanner.close();
		 
				if (score < 0 || score > 100) {
					System.out.println("输入的分数不在0-100之间，不符合要求");
				} else if (score >= 90) {
					System.out.println("优");
		 
				} else if (score >= 80) {
					System.out.println("良");
				}
					else if(score>=70) {
						System.out.println("中");
					}
				 else if (score >= 60) {
					System.out.println("及格");
				} else {
					System.out.println("差");
		 
				}
			}
		
	}


