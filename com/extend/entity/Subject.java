package com.extend.entity;
//属性、行为--动态、构造方法
public class Subject {
//成员变量 私有
	private String subjectNo;
	private String subjectName;
	private int subjectTime;
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectTime() {
		return subjectTime;
	}
	public void setSubjectTime(int subjectTime) {
		this.subjectTime = subjectTime;
	}
	//没有返回类型、和类名相同
	//入参的规则：类型、入参名
	public Subject(String subjectNo,String subjectName,int subjectTime) {
		this.subjectNo=subjectNo;
		this.subjectName=subjectName;
		this.subjectTime=subjectTime;
	}
}
