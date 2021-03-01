package HashMap;

import java.util.*;
import java.util.Map.*;

public class MainClass {

	public static void main(String[] args) {
		HashMap<String, Allthings> Map = new HashMap<String, Allthings>();
		//增加 put()
		Allthings apple = new Allthings("1","苹果",10);
		Map.put("1",apple);//Entry
		Allthings orange = new Allthings("2","橘子",8);
		Map.put("2",orange);
		Allthings meat = new Allthings("3","猪肉",30);
		Map.put("3",meat);
		//查询
		//Map.get(1);
		//遍历 key集合
		Set<String> keys = Map.keySet();
		for(String num:keys) {
			System.out.println(num);
		}
		//value
		for(Allthings value:Map.values()) {
			System.out.println(value);
		}
		//Entry
		Set<Entry<String,Allthings>> entry = Map.entrySet();
		for(Entry<String,Allthings> goods : entry) {
			System.out.println(goods.getKey()+"--->"+goods.getValue());
		}
		//删除
		//Map.remove("1");
		//修改 替换 先删除后增加
		//Map.replace("1", apple);
	}

	}

