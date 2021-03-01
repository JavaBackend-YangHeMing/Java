import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test1 {
	int[] v1 = new int[5];

	public static void main(String[] args) {
		     List<String> list=new ArrayList<String>();
		     list.add("java");
		     list.add("python");
		     list.add("c");
		     list.add("c++");
		     list.add(3,"php");
		     list.set(2, "go");
		     System.out.println("数组长度为："+list.size());
		     for (String str : list) {//也可以改写 for(int i=0;i<list.size();i++){syso  alt + /  list.get(i)} 这种形式
		        System.out.println(str);
		     }
		     
		     ArrayList<String> ss = new ArrayList<String>();
		     ss.add("123");
		     ss.add("234");
		     System.out.println(ss);
		     
		     
		     
		     
		     String[] strArray=new String[list.size()];
		     list.toArray(strArray);
		     for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
		     {
		        System.out.println(strArray[i]);
		     }
		     
		     Iterator<String> ite=list.iterator();
		     while(ite.hasNext())//判断下一个元素之后有值
		     {
		         System.out.println(ite.next());
		     }
		 }
	}

