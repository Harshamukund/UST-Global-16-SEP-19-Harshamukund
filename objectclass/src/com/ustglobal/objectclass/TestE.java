package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {
		Car c=new Car(123000,"tata","yellow");
		int h=c.hashCode();
		System.out.println(h);
		String s=c.toString();
		System.out.println(s);

	}

}
