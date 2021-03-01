package 杨鹤鸣;
public class Taxi implements MotorVechicles,controlAirTemperature{
	public void charge() {
		System.out.println("出租车收费");
	}
	public void brake() {
		System.out.println("出租车刹车");
	}
	public void controlAirTemperature() {
		System.out.println("打空调");
	}
}
