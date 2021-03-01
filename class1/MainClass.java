package class1;

public class MainClass {
public static void main(String[] args) {
	TV Changhong = new TV();
//	TV Changhong1 = new TV();
	Familiy zhangsan=new Familiy(Changhong);
//	Familiy Lisi = new Familiy(Changhong1);
	zhangsan.remoteControl(2);
	zhangsan.seeTV();
}
}
