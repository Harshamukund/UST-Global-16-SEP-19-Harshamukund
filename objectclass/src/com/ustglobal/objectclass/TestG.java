package com.ustglobal.objectclass;

public class TestG {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "vinay", 30000);
		Employee e2=new Employee(2, "sumukh", 15000);
		Employee e3=new Employee(3, "kishor", 10000);
		Employee e4=e3;
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));

	}

}
