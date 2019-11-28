package com.ustglobal.beanobject;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
	System.out.println("scanner class");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Age");
	int age=sc.nextInt();
	System.out.println("Age is "+age);
	
	System.out.println("Are u a male");
	boolean a =sc.nextBoolean();
	System.out.println(a);

	
	System.out.println("enter name");
	String n =sc.next();
	System.out.println("name is "+n);
	
	System.out.println("enter college name");
	String cn =sc.nextLine();
	System.out.println("college name is "+cn);

	System.out.println("enter marks");
	float m =sc.nextFloat();
	System.out.println("marks is "+m);

	}

}
