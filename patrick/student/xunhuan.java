package patrick.student;
import java.util.Random;
import java.util.Scanner;
public class xunhuan {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int user;
        Random ra=new Random();//����random����ʵ�����������
        int pc;
            do{
                System.out.println("�������������Ƕ���?(0-9): ");
                user=in.nextInt();
                pc=ra.nextInt(10);//����һ���������Χ
                if(user<pc){
                System.out.println("������˼�����С�ˣ�"+"���ɵ�������ǣ�"+pc);
                System.out.println();
                }
                else if(user>pc){
                System.out.println("������˼����´��ˣ�"+"���ɵ�������ǣ�"+pc);  
                System.out.println();
                }
            }while(user!=pc); //��������дwhile��user��=pc��ʹ��ѭ��
                System.out.println("��ϲ��¶���! "+"���ɵ�������ǣ�"+pc);//��������������ѭ��
		}	 
		}

