package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a=10;
	int b=a;/*implicit type casting*/
		int p=20;
	double d=p;
		System.out.println("d is"+d);
		System.out.println("==================");
		double x=20.67;
		int y=(int) x;
		byte z=(byte) y;
		System.out.println("byte z is "+z);
		char c=(char) y;
		System.out.println("char c is "+c);
	
	}

}
