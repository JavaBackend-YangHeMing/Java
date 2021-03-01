package 共饮同井水;

public class Land {

	public static void main(String[] args) {
		// 类名.类方法(入参)
		System.out.println("*******用水情况**********");
		System.out.println();
		Village.setWaterAmount(500);
		Village gaojiazhuang = new Village("高家庄");
		Village lijiazhuang = new Village("李家庄");
		gaojiazhuang.drinkWater(50);
		lijiazhuang.drinkWater(44);
		Village.getWaterAmount();
		System.out.println();
		System.out.println();
		
		System.out.println("********人口信息***********");
		System.out.println();
		gaojiazhuang.setPeopleNumber(532);
		lijiazhuang.setPeopleNumber(356);
		lijiazhuang.movePeople(129);
		gaojiazhuang.movePeople(233);
		gaojiazhuang.getPeopleNumber();
		lijiazhuang.getPeopleNumber();
	}

}
