package JieKoudemo.Classes;
public class Taxi implements MotorVechicles,jiekou2{
	public void charge(String charge) {
		System.out.println("出租车收费标准："+charge);
	}
	public void brake() {
		System.out.println("出租车采用ABS防抱死制动系统，紧急制动很不错!");
	}
	public void controlAirTemperature() {
		System.out.println("出租车空调在中控台可控制全车环绕式空调启动！");
	}
}
