package 多线程;

public class test {

	public static void main(String[] args) {
		ThreadDemo a = new ThreadDemo("第一种方法 Thread子类方法：");
		a.start();
		System.out.println();
		
		TreadDemo2 b = new TreadDemo2();
		ThreadDemo b1 = new ThreadDemo("第二种方法 Runnable接口方法:");
		b1.start();
		System.out.println();
		
	}

}
