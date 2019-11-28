package com.ustglobal.beanobject;

public class Database {
	void recieve(Student s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Rollno is "+s.getRollno());
		System.out.println("=====================");


	}
	void save(Employee e) {
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Dept is "+e.getDept());
		System.out.println("Designation is "+e.getDesignation());
		
		
	}

}
