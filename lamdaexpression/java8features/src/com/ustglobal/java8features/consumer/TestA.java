package com.ustglobal.java8features.consumer;

import java.util.function.Consumer;

public class TestA {

	public static void main(String[] args) {
		Consumer<Student> c=(s)->{
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		};
		Student s1=new Student(101,"gagan",88.88);
		c.accept(s1);
		
	}

}
