package com.ustglobal.arrays;

public class TestC {

	public static void main(String[] args) {
		Student s1=new Student(1,"arya",78.99);
		Student s2=new Student(2,"nithin",98.99);
		Student s3=new Student(3,"chinka",88.99);
		Student[] stud=new Student[3];
		stud[0]=s1 ;
		stud[1]=s2;
		stud[2]=s3;
		for(Student s:stud) {
			System.out.println(s);
		}
		recieve(stud);

	}
	static void recieve(Student[] stu) {
		System.out.println(stu);
	}

}
