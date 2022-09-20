package patrick.student;
import java.util.Random;
import java.util.Scanner;
public class RandomPointName {
	public static void main(String[] args) {
        System.out.println("------------云计算一二班点名程序------------");
        System.out.println("------------请你选择序号进行操作------------");
        System.out.println("================================");
        System.out.println("      （1）浏览班级学生姓名信息");
        System.out.println("      （2）随机抽取班级学生姓名");
        System.out.println("      （3）退出这个程序");
        System.out.println("================================");
        String[] student = {"王庚","唐梓铭","蒋芷若","任丽","杨曾云","施奕任","沈逸天","彭兆波","沈旭翔","杨卓颖","张孜瑞","冷佩芸","陈俊洁",
        		"李馥君","蒋镇宇","李思琪","鄢小航","李科蓓","李书睿","叶云汲","李长江","张佳军","罗旭","汪汉培","李茂","李靖宇","蔡章进","王德敏",
        		"田展鹏","杨鹤鸣","高维","黄凡","毛沛","江天韵","李绍洁","钟茂一","简金龙","王浩宇","李雨洋","王珺","王宇涛","王奕皓","王海","彭孟蝶",
        		"陈锐航","程文奇","鲁志恒","杨华","杨帆","徐瑞","余杰","欧阳乐","钟富强","明胜","叶涛","伍一波","郭玲涛","严章超","李成杰","雷兴露","王重然"};
		//引用文件更方便
/**
 * 报错：
 * Error occurred during initialization of VM 
 * Could not reserve enough space for object heap
 * 解决办法：
 * Window->Preferences->Java->Installed JRES->Edit->Default VM Arguments    设置为：-Xms64m   -Xmx256m 
 */
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println();
        while(flag){
        	System.out.println("操作：1.显示信息 2.随机点名 3.终止程序：");
            int n = sc.nextInt();
        switch (n){
            case 1:{
                printstudent(student);
                System.out.println();
                break;
            }
            case 2:{
             String name = randomstudent(student);
                System.out.println("   点到的学生姓名是："+name);
                break;
            }
            case 3:{
                flag = false;
                System.out.println("温馨提示：*****程序已终止!!*****");
                break;
            }
            default:{
                System.out.println("温馨提示：*****输入错误，请重新输入!!*****");
                System.out.println();
                break;
            }
          }
        }
    }
    public static void printstudent(String[] stu){
    	System.out.println("*****当前正在显示班级所有学生的姓名信息*****");
        System.out.println("*****云计算一二班学生姓名如下*****");
        for (int a = 0; a<stu.length; a++ ){
            System.out.print(" "+ stu[a] +" ");
            if(a==stu.length/2) {
            	System.out.println();           	
            	a++;
            }
        }
        System.out.println();
    }
    public static String randomstudent(String[] stu){
        int a = new Random().nextInt(stu.length);//在数组里获取随机数，nextInt 返回值是int类型的（stu.length）数组长度
        System.out.println("温馨提示：*****当前正在进行点名!!*****");
        System.out.println("      第"+(a+1)+"个同学被点到了！");
        String name = stu[a];
        return name ;
    }
}
