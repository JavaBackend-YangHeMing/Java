package patrick.student;

import java.util.Scanner;

public class panduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scanner = new Scanner(System.in);
				System.out.println("�����������");
				double score = scanner.nextDouble();
				scanner.close();
		 
				if (score < 0 || score > 100) {
					System.out.println("����ķ�������0-100֮�䣬������Ҫ��");
				} else if (score >= 90) {
					System.out.println("��");
		 
				} else if (score >= 80) {
					System.out.println("��");
				}
					else if(score>=70) {
						System.out.println("��");
					}
				 else if (score >= 60) {
					System.out.println("����");
				} else {
					System.out.println("��");
		 
				}
			}
		
	}


