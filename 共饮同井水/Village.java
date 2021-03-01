package 共饮同井水;
//村庄  除了内部类不可能再出现class
//成员变量 成员方法 构造方法

public class Village {
private static int waterAmount;
private int peopleNumber;
private String name;

//去掉static 实例方法是可以调用所有的成员变量   类方法只能调用到类变量
//内存加载的顺序：类变量、类方法、实例变量、实例方法
public static int getWaterAmount() {
	return waterAmount;
}
public static void setWaterAmount(int waterAmount) {
	System.out.println("共有"+waterAmount+"吨水");
	Village.waterAmount = waterAmount;
}
public int getPeopleNumber() {
	System.out.println(name+"还有"+peopleNumber+"人");
	return peopleNumber;
}
public void setPeopleNumber(int peopleNumber) {
	this.peopleNumber = peopleNumber;
	System.out.println(name+"共有"+peopleNumber+"人");
}
public Village(String name) {
	this.name = name;
}
public void drinkWater(int num) {
	System.out.println(name+"用了"+num+"吨水");
	waterAmount=waterAmount-num;
	System.out.println("还剩"+waterAmount+"吨水");
}
public void movePeople(int num) {
	System.out.println(name+"迁出去了"+num+"人");
	peopleNumber = peopleNumber-num;
}
		}
