package com.mytest.app;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World! My name is Eric!");
		
		System.out.println("In this branch, I would like to do a for-loop for 10");
		for (int i = 0; i < 10; i++) {
			System.out.println("> Item: [" + (i + 1 * i) + "]");
		}
	}
}
