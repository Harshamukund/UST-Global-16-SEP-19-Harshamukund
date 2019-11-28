package com.ustglobal.java8features.supplier;

import java.util.function.Supplier;

public class TestA {

	public static void main(String[] args) {
		Supplier<Student> s=()->new Student(2,"ajay",65.66);
		Student s1=s.get();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.percentage);
		
		Supplier<Integer> i=()->20;
		int s3=i.get();
		System.out.println(s3);
		
		Supplier<String> i1=()->"good evening";
				String s2=i1.get();
				System.out.println(s2);
	}

}
