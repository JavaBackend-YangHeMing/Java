package patrick.student;
import java.util.Random;
import java.util.Scanner;
public class randomTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int user;
        Random ra=new Random();//引用random进行实现随机数功能
        int pc;
            do{
                System.out.println("请猜随机生成数是多少?(0-9): ");
                user=in.nextInt();
                pc=ra.nextInt(10);//设置一个随机数范围
                if(user<pc){
                System.out.println("不好意思，你猜小了！"+"生成的随机数是："+pc);
                System.out.println();
                }
                else if(user>pc){
                System.out.println("不好意思，你猜大了！"+"生成的随机数是："+pc);  
                System.out.println();
                }
            }while(user!=pc); //条件里填写while（user！=pc）使它循环
                System.out.println("恭喜你猜对了! "+"生成的随机数是："+pc);//条件不成立跳出循环
		}	 
		}

