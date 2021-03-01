package com.phone;

public final class IOS extends PhoneFeatures {
	String cpu;
	//其他类不能访问该方法
	private void  imessage() {
		System.out.println("imessage短信发送成功");
	}
	//初始化成员变量 默认调用父类的无参构造方法	
	public IOS(String cpu) {
		this.cpu=cpu;
	}
	public IOS(String cpu,String name) {
		this(cpu);
		this.name=name;
	}
	public IOS(String cpu,String name,int size) {
		super(size);
		this.cpu=cpu;
		this.name=name;
	}
	public boolean sendMessage(int num) {
		boolean isSuccess=super.sendMessage(num);
		if(!isSuccess) {
			imessage();
		}
		return true;		
	}
}