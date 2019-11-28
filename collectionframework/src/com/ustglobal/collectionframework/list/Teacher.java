package com.ustglobal.collectionframework.list;

public class Teacher {
	int id;
	String name;
	double salary;
	public Teacher(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
