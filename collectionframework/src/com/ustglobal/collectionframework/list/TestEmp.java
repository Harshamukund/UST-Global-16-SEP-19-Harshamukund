package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestEmp {

	public static void main(String[] args) {
	ArrayList<Employee> a1=new ArrayList<Employee>();
	Employee e1=new Employee(1,"harsha",35000.00);
	Employee e2=new Employee(2,"kishor",25000.00);
	Employee e3=new Employee(3,"vinay",24000.00);
	Employee e4=new Employee(4,"sumukh",15000.00);
	Employee e5=new Employee(5,"kiran",45000.00);
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
	a1.add(e4);
	a1.add(e5);
	for(int i=0;i<a1.size();i++) {
		Employee e=a1.get(i);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	System.out.println("==for each=====");
	for(Object o1:a1) {
		System.out.println(o1);
	}
	System.out.println("=====iterator=======");
	Iterator<Employee> it1=a1.iterator();
	while(it1.hasNext()) {
		Employee e=it1.next();
		System.out.println(e);
	}
	System.out.println("========listiterator===========");
	ListIterator<Employee> lit=a1.listIterator();
	while(lit.hasNext()) {
		Employee e=lit.next();
		System.out.println(e);
	}

	LinkedList<Employee> l1=new LinkedList<Employee>();
	Employee e6=new Employee(6,"abhi",35000.00);
	Employee e7=new Employee(7,"akarsh",25000.00);
	Employee e8=new Employee(8,"bharath",24000.00);
	Employee e9=new Employee(9,"chethan",15000.00);
	Employee e10=new Employee(10,"chandhan",45000.00);
	l1.add(e6);
	l1.add(e7);
	l1.add(e8);
	l1.add(e9);
	l1.add(e10);
	for(int i=0;i<l1.size();i++) {
		Employee e=l1.get(i);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	System.out.println("==for each=====");
	for(Object o1:l1) {
		System.out.println(o1);
	}
	System.out.println("=====iterator=======");
	Iterator<Employee> iit1=l1.iterator();
	while(iit1.hasNext()) {
		Employee e=iit1.next();
		System.out.println(e);
	}
	System.out.println("========listiterator===========");
	ListIterator<Employee> lit1=l1.listIterator();
	while(lit1.hasNext()) {
		Employee e=lit1.next();
		System.out.println(e);
	}

	Vector<Employee> v=new Vector<Employee>();
	Employee e11=new Employee(11,"darshan",35000.00);
	Employee e12=new Employee(12,"dravid",25000.00);
	Employee e13=new Employee(13,"dhoni",24000.00);
	Employee e14=new Employee(14,"dinda",15000.00);
	Employee e15=new Employee(15,"deekshith",45000.00);
	v.add(e11);
	v.add(e12);
	v.add(e13);
	v.add(e14);
	v.add(e15);
	for(int i=0;i<v.size();i++) {
		Employee e=v.get(i);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	System.out.println("==for each=====");
	for(Object o1:v) {
		System.out.println(o1);
	}
	System.out.println("=====iterator=======");
	Iterator<Employee> it2=v.iterator();
	while(it2.hasNext()) {
		Employee e=it2.next();
		System.out.println(e);
	}
	System.out.println("========listiterator===========");
	ListIterator<Employee> lit2=v.listIterator();
	while(lit2.hasNext()) {
		Employee e=lit2.next();
		System.out.println(e);
	}

	
	Stack<Employee> s=new Stack<Employee>();
	Employee e16=new Employee(16,"harsha",35000.00);
	Employee e17=new Employee(17,"kishor",25000.00);
	Employee e18=new Employee(18,"vinay",24000.00);
	Employee e19=new Employee(19,"sumukh",15000.00);
	Employee e20=new Employee(20,"kiran",45000.00);
	s.add(e16);
	s.add(e17);
	s.add(e18);
	s.add(e19);
	s.add(e20);
	for(int i=0;i<s.size();i++) {
		Employee e=s.get(i);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	System.out.println("==for each=====");
	for(Object o1:s) {
		System.out.println(o1);
	}
	System.out.println("=====iterator=======");
	Iterator<Employee> it3=s.iterator();
	while(it3.hasNext()) {
		Employee e=it3.next();
		System.out.println(e);
	}
	System.out.println("========listiterator===========");
	ListIterator<Employee> lit3=a1.listIterator();
	while(lit3.hasNext()) {
		Employee e=lit3.next();
		System.out.println(e);
	}

	



	}

}
