package com.ustglobal.hasarelation.weak;

public class TestA {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("=======================");
		p.m.write();//Has-A relation

	}

}
