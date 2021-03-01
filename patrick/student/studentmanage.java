package patrick.student;

public class studentmanage {
/**
 * 学号、姓名、年龄、体重、成绩、是否是党员
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       byte studentAge=20;
      /**
       *  ctrl+/快捷键注释代码
       *  short number=10000;
       *  int chengdupeoples=10000000;
       *  long L后缀 不写默认是int
       *  long worldpeople=7000000000000L;
       *  float double     尽量使用double，double范围广
       *  float 必须使用F或者f作为后缀，不然默认为double，double 可以用D或者d也可以不写
       */
      float studentWeight=99.9f;
      //字符型一定是单引号括起的一个字符 比如 'a' 'c'
      char geade='A';
      //是否是党员
      boolean isPrtyMember=true;
      //输出数据
     // System.out.println("a");
      //输出并换行
     // System.out.print("b");
      //输出不换行
      System.out.println("体重："+studentWeight);
	}

}
