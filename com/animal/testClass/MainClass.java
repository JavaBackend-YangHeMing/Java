package com.animal.testClass;

import com.animal.AllClass.*;

public class MainClass {
	//向上转型,子类对象赋值给父类引用
	public static void main(String[] args) {
		// Dog X = new Dog("哈士奇","I can 汪汪汪！");-----A is a B
		//向上转型自动转型，基本数据类型--低转高自动转----高转低强制转
		//当子类对象赋值给父类引用后，向上转型后只能调用到父类的方法和子类重写的方法
		Animal X = new Dog("哈士奇","汪汪汪！");//这行代码把Dog类改成它的父类Animal 就完成了向上转型
		Animal Y = new Cat("短毛猫","喵喵喵！");
		Animal jiafeimao = new Cat("加菲猫","喵喵喵！");
		
		Simulator Z = new Simulator();
		Z.playSound(X);
		Z.playSound(Y);
		Z.playSound(jiafeimao);
	}

}
