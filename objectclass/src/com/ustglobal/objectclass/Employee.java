package com.ustglobal.objectclass;

public class Employee {
	int id;
	String name;
	int Salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		Employee e=(Employee) obj;
		if(this.id==e.id) {
			if(this.name.equals(e.name)) {
				if(this.Salary==e.Salary) {
					return true;
				}
				else {
					return false;
				}
				
			}
			else {
				return false;
			}
			
		}
		else {
			return false;
		}
		
	}

}
