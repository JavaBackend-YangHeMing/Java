package com.phone;

public class PhoneFeatures {
	// 静态属性 数据 屏幕尺寸,型号名
		// static final定义常量
		// 先声明不设置值（初始化）需要在構造方法里设置
		public static final int SIZE = 10;
		String name;
		// 动态行为：方法 功能 打电话，发短信
		public final void call() {
			System.out.println("打电话");
		}
		public boolean sendMessage(int num) {
			if(num==11) {
				System.out.println("发短信成功");
				return true;
			}else {
				System.out.println("发短信失败");
				return false;
			}
		}
		// 如果有自定义的构造方法的话，系统就不会默认创建无参的构造方法
		public PhoneFeatures(int size) {
		}
		public PhoneFeatures() {
		}
	}

