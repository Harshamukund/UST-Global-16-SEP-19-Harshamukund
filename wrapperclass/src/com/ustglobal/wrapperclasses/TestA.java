package com.ustglobal.wrapperclasses;

public class TestA {

	public static void main(String[] args) {
int a=10;
System.out.println("a is "+a);
Integer i=a;/*boxing or auto boxing*/
System.out.println("i is "+i);
Integer x=10;
System.out.println("x is "+x);
int y=x; /*unboxing or autounboxing*/
System.out.println("y is "+y);


int value=Integer.parseInt("123");
System.out.println("value is "+value);
boolean result=Boolean.parseBoolean("true");
System.out.println("result is "+result);


/*int value=Integer.parseInt("123aaa");
System.out.println("value is "+value);
boolean result=Boolean.parseBoolean("true123");
System.out.println("result is "+result);
*/
	}

}
