package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student(101,"ankitha",45.55);
		Student s2=new Student(102,"pinkitha",65.55);
		Student s3=new Student(103,"sharukh",85.55);
		
		a1.add(s1);
		a1.add(s2);

		a1.add(s3);

		
		for(int i=0;i<a1.size();i++) {
			Student s=a1.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("Percentage is "+s.percentege);
		}
		System.out.println("=====foreach=====");
		for(Student  s:a1) {
			System.out.println(s);
		}
		System.out.println("=======iterator==========");
		Iterator<Student> i1=a1.iterator();
		for(;i1.hasNext();) {
			Student s9=i1.next();
			System.out.println(s9);
			
			
		}
		System.out.println("====list iterator forward=========");
		ListIterator<Student> i2=a1.listIterator();
		while(i2.hasNext()) {
			Student s9=i2.next();
			System.out.println(s9);
		}
		
		System.out.println("====list iterator backward=========");
		ListIterator<Student> i3=a1.listIterator();
		while(i3.hasPrevious()) {
			Student s9=i2.previous();
			System.out.println(s9);
		}
		


			
		}


		

	}


