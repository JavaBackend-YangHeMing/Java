package JieKoudemo.Classes;

public class Bus implements MotorVechicles {
	public void charge(String charge) {
		System.out.println("公交车收费标准："+charge);
	}
	public void brake() {
		System.out.println("公交车用碟刹进行刹车！");
	}
}
