public class test {
	public static void main(String[] args) {
		String name = " JAVA 编程 基础";
		int len = name.length();
		System.out.println("字符串长度为："+len);
		System.out.println("返回的字如下：!!!");
		System.out.println(name.substring(7,8));
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,7));
		byte [] Str2 = name.getBytes();
		System.out.print("返回byte类型为：");
		//****注意：需要循环才能输出 ，因为这输出的是一个地址，存放在栈里面，需要使用循环把每一个地址输出来***
		for(int i=0;i<name.length();i++) {
			System.out.print(Str2[i]+" ");
		}//循环输出数组
		System.out.println("返回地址为："+Str2);
		System.out.println(name.trim());
		String name2 = "JAVA编程基础，我喜欢java编程";
		System.out.println("'A'字符第一次出现位置为："+name2.indexOf('A'));
		String str="编程";
		System.out.println("“编程”第一次出现的位置:"+name2.indexOf(str));
		System.out.println("'A'字符最后一次出现位置为："+name2.lastIndexOf('A'));
		System.out.println("“编程”最后一次出现位置为："+name2.lastIndexOf(str));
		System.out.println("index值为8的位置开始，找到第一个“编程”出现的位置为："+name2.indexOf(str, 8));
		System.out.println("将英文字母全部转换为大写输出为："+name2.toUpperCase());
		System.out.println("将英文字母全部转换为小写输出为："+name2.toLowerCase());
		String a = "java";
		String b = "java";
		String c = new String("java");
		System.out.println("a == b的结果："+(a == b));
        System.out.println("a == c的结果："+(a == c));
        System.out.println("b == c的结果："+(b == c));
        System.out.println("a与b是否相等："+a.equals(b));
        System.out.println("a与c是否相等："+a.equals(c));
        System.out.println("b与c是否相等："+b.equals(c));
        
        StringBuffer str2 = new StringBuffer("java 框架");
        System.out.println(str2.append("就是一个说明书"));
        System.out.println(str2.delete(9, 11));
        System.out.println("111"+str2.replace(10, 10, ""));
        System.out.println(str2.replace(str2.length()-1,str2.length(), "文档"));
        System.out.println(str2.reverse());
	}
}