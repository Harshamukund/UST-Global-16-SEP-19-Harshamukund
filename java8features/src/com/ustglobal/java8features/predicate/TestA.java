package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		Predicate<Employee> p=e ->{
			if(e.salary>20000) {
				return true;
			}
			else {
				return false;
			}
		};
		Employee e=new Employee(121,"harsha",450000);
		boolean b=p.test(e);
		System.out.println(b);
	}

}
