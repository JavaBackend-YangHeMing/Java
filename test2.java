import java.util.ArrayList;
import java.util.List;

public class test2 {
		List<String> line = new ArrayList<String>();
		public void printLines() {
			for(String str : line) {
				System.out.println(str+",");
				/*增强型for循环
				 * 
				 * 编译器会认为： 

				1.创建名称为str 的String变量。
				2.将s的第一个元素赋给str 。
				3.执行重复的内容。
				4.赋值给下一个元素str 。
				5.重复执行至所有的元素都被运行为止

				优点：
				这种写法让我们代码看起来更加的简洁
				缺点：
				1. 只能顺次遍历所有元素，无法实现较为复杂的循环
				2对于数组，不能方便的访问下标值；
				3对于集合，与使用Interator相比，不能方便的删除集合中的内容（在内部也是调用Interator）.
				4 除了简单遍历并读取其中的内容外，不建议使用增强的for循环
				 */
			}
		}
	}

