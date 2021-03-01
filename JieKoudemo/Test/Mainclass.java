package JieKoudemo.Test;
import java.util.Scanner;
import JieKoudemo.Classes.Bus;
import JieKoudemo.Classes.Taxi;
public class Mainclass {
			public static void main(String[] args) {
			boolean flag=true;
			System.out.println("**现在您是车辆收费管理者！**");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			@SuppressWarnings("resource")
			Scanner choose = new Scanner(System.in);
			while(flag) {
			System.out.println("请输入1管理出租车，请输入2管理公交车,输入3退出管理！");
			int n=choose.nextInt();
			switch (n) {
			case 1:{
			Taxi taxi = new Taxi();
			System.out.println("**请输入出租车的收费规则！**");
			taxi.charge(input.next());
			System.out.println("**出租车信息如下：**");
			taxi.brake();
			taxi.controlAirTemperature();
			System.out.println();
			continue;}
			case 2:{
			Bus bus = new Bus();
			System.out.println("**请输入公交车的收费规则！**");
			bus.charge(input.next());
			System.out.println("**公交车信息如下：**");
			bus.brake();
			System.out.println();
			continue;}
			case 3:{
			flag = false;
			System.out.println("**警告：您已退出！**");
			break;}
			default:{
			System.out.println("警告：指令不正确！已退出（3指令）请重新运行！请重新输入指令！");
			}}}}}

