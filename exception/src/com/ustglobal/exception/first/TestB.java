package com.ustglobal.exception.first;

public class TestB {
	static int b;

	public static void main(String[] args) {
		System.out.println("main started");
	int a=0;
	try {
		b=10/a;
	}catch(ArithmeticException ae) {
		System.out.println("number is divided by zero");
	}
	System.out.println(b);
	System.out.println("main ended");

	}

}
