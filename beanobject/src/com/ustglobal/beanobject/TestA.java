package com.ustglobal.beanobject;

public class TestA {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(12);
		s.setName("shivagami");
		s.setRollno(134);
		Database db=new Database();
		db.recieve(s);
		
		
		
		Employee e=new Employee();
		e.setId(111);
		e.setName("alia");
		e.setSalary(120000);
		e.setDept("developer");
		e.setDesignation("hr");

	}

}
