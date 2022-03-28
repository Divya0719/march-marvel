package com.test.coml;

public class rest {

	
	public rest() {
		System.out.println("test");
	}
	
	public rest(int a) {
		System.out.println("a"+a);
	}
	
	public rest(String name) {
		this(5);
		System.out.println("name"+ name);
		
	}
	
	public static void main(String[] args) {
		rest ref = new rest ("Divya");
		
	}
}
