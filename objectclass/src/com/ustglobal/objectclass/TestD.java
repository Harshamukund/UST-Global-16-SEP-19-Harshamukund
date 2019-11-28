package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {
		Student s=new Student(1,"kishor",70.56);
		int h=s.hashCode();
		System.out.println(h);
		String ts=s.toString();
		System.out.println(ts);

	}

}
