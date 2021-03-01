package com.exception;

@SuppressWarnings("serial")
public class DangerException extends Exception {
	public  DangerException() {
	}
	public void toShow() {
		System.out.println("  属于危险品！");
	}
	
}
