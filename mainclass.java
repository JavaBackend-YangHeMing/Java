import java.util.*;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		test2 a = new test2();
		System.out.println("请输入三个你想输入的东西：");
		a.line.add(sc.nextLine());
		a.line.add(sc.nextLine());
		a.line.add(sc.nextLine());
		a.printLines();
}
}
