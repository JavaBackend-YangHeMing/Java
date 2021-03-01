import java.util.Random;
import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
		
		
		//计算1！+2！+....+10!的和
		int a = 1,sum=0;
		for(int i = 1;i<=10;i++) {
			int j = i;
			while(j!=0) {
				a = a*j;
				j= j-1;
			}
			sum = a+sum;
			a = 1;
		}
		
		
		
		System.out.println("1！+2！+....+10!的和为："+sum);
		//求100内所有素数（质数）
		System.out.println("100内所有素数为：");
		for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }  
        }
		
		
		//do-while循环和for循环计算1+1/2!+1/3!+....+1/20!的和
		double sum1=0,item=1;
		int i=1;
 
		//for循环计算
		for(;i<=10;) {
			sum1 = sum1+item;
			i=i+1;
			item = item*(1.0/i);
		}
 
		//do-while循环计算
		do {
			sum1 = sum1+item;
			i=i+1;
			item = item*(1.0/i);
		}
		while(i<=10);
		System.out.println();
		System.out.println("1+1/2!+1/3!+....+1/20!的和:"+sum1);
		
		//使用for循环语句计算8+88+888+......前十项的和
		int b;
		long sum2=0,b1=8;
		for(b=1;b<=10;b++){
			sum2=sum2+b1;
			System.out.println("第"+b+"项："+b1);
			b1=b1*10+8;
				
		}
		System.out.println("他们的和 为："+sum2);
		
		//定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，计算并输出学生的平均成绩、最高成绩、最低成绩
		
		int arr []={72,89,65,58,87,91,53,82,71,93,76,68};
		int sum3=0,min=arr[0],max=arr[0];
		for(int c=0;c<arr.length;c++){
		sum3=sum3+arr[c];
		if (max < arr[c]){
            max = arr[c];
        }
		else if (min>arr[c]) {
			min = arr[c];
		}
		}
		int ave=sum3/(arr.length);
		System.out.println("平均成绩为："+ave);
		System.out.println("最高成绩为："+max);
		System.out.println("最低成绩为："+min);
		
		//某百货商场当日消费积分最高的八名顾客，他们的积分分别是：18，25，7，36，13，2，89和63， 编写程序找出最低的积分及它在数组中的原始位置（索引）
		
		int arr1[]= {18,25,7,36,13,2,89,63};
		int min1=arr1[0];
		int index=0;
		for(int d=0;d<arr1.length;d++) {
			if(min1>arr1[d]) {
				min1=arr1[d];
				index=d;
			}
		}
		System.out.println("最低积分为："+min1+" 它在数组中的位置为："+index);
		
		//将变量a，b，c内存中的数值按大小顺序进行互换（从小到大排列）。
		int a1 = 11,b2 = 9,c1 = 10,t = 0;
		if(b2<a1) {
			t = a1;
			a1 = b2;
			b2 = t;
		}
		if(c1<a1) {
			t = a1;
			a1 = c1;
			c1 = t;
		}
		if(c1<b2) {
			t = b2;
			b2 = c1;
			c1 = t;
		}
		System.out.println("从小到大排序为："+"a="+a1+",b="+b2+",c="+c1);
	
		//循环输出小写英文字符。 要求：1、字母之间用空格分隔  2、分两行输出，一行13个
		char ch='a';
		int count=1;//控制换行
		while(ch<='z'){
		System.out.print(ch+" ");
		if(count%13==0)
		System.out.println();
		count++;
		ch++;
		}
		
		//do-while循环语句来实现猜字游戏
		int number=6;
		int guess;
		System.out.println("请输入数字进行猜(1-10)：");
		do {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		guess=reader.nextInt();
		if(guess>number) {
		System.out.println("猜大了哦");
		}else if(guess<number) {
		System.out.println("猜小了耶");
		}
		}while(guess!=number);
		System.out.println("恭喜你终于猜对了");
		
		//请将我们之前的点名字代码进行优化（实现输入一次姓名进行多轮抽奖的功能）
        System.out.println("------------云计算一二班点名程序------------");
        System.out.println("------------请你选择序号进行操作------------");
        System.out.println("================================");
        System.out.println("      （1）浏览班级学生姓名信息");
        System.out.println("      （2）随机抽取班级学生姓名");
        System.out.println("      （3）退    出   这  个   程   序");
        System.out.println("================================");
        String[] student = {"王庚","唐梓铭","蒋芷若","任丽","杨曾云","施奕任","沈逸天","彭兆波","沈旭翔","杨卓颖","张孜瑞","冷佩芸","陈俊洁",
        		"李馥君","蒋镇宇","李思琪","鄢小航","李科蓓","李书睿","叶云汲","李长江","张佳军","罗旭","汪汉培","李茂","李靖宇","蔡章进","王德敏",
        		"田展鹏","杨鹤鸣","高维","黄凡","毛沛","江天韵","李绍洁","钟茂一","简金龙","王浩宇","李雨洋","王珺","王宇涛","王奕皓","王海","彭孟蝶",
        		"陈锐航","程文奇","鲁志恒","杨华","杨帆","徐瑞","余杰","欧阳乐","钟富强","明胜","叶涛","伍一波","郭玲涛","严章超","李成杰","雷兴露","王重然"};//如果引用文件更方便
/**
 * 使用该数组出现的问题：
 * Error occurred during initialization of VM 
 * Could not reserve enough space for object heap
 * 解决办法：
 * Window->Preferences->Java->Installed JRES->Edit->Default VM Arguments    设置为：-Xms64m   -Xmx256m 
 */
        @SuppressWarnings("resource")
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
        int a = new Random().nextInt(stu.length);//在数组里头儿获取随机数，nextInt 返回值是int类型的（stu.length）数组长度
        System.out.println("温馨提示：*****当前正在进行点名!!*****");
        System.out.println("      第"+(a+1)+"个同学被点到了！");
        String name = stu[a];
        return name ;
    	
		
	}
}
