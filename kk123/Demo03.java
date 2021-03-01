package kk123;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo03 {
	public static void main(String[] args) {
		      Student ss = new Student();
		      ss.getSum();
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int num1 = s2.getSum() - s1.getSum();
                int num2 = (num1 == 0) ? s2.getChinese() - s1.getChinese() : num1;
                int num3 = (num2 == 0) ? s2.getMath() - s1.getMath() : num2;
                int num4 = (num3 == 0) ? s2.getEnglish() - s1.getEnglish() : num3;
                int num5 = (num4 == 0) ? s2.getAge() - s1.getAge() : num4;
                int num6 = (num5 == 0) ? s2.getName().compareTo(s1.getName()) : num5;
                return (num6 < 0) ? -1 : ((num6 == 0) ? 0 : 1);
            }
        });
        for (int i = 1; i <= 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第" + i + "个学生的信息:");
            System.out.print("姓名:");
            String n = input.next();
            System.out.print("年龄:");
            int a = input.nextInt();
            System.out.print("语文成绩:");
            int c = input.nextInt();
            System.out.print("数学成绩:");
            int m = input.nextInt();
            System.out.print("英语成绩:");
            int e = input.nextInt();
            Student s = new Student();
            s.setName(n);
            s.setAge(a);
            s.setChinese(c);
            s.setMath(m);
            s.setEnglish(e);
            ts.add(s);
        }
        for (Student t : ts) {
            System.out.println(t);
            System.out.println("总成绩"+ss);
        }
    }
}
