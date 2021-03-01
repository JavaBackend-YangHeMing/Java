package 多线程;
/*
 * 两种方法：第一种，创建一个Thread的子类------public class ThreadDemo  extends Thread
 */
public class ThreadDemo  extends Thread{
		//导出学生名单
		public void run() {
			System.out.println(getName()+"导出");
		}
		public ThreadDemo(String name) {
			super(name);
		}
}
