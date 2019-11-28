

package com.ustglobal.collectionframework.list;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.ListIterator;
	import java.util.Stack;
	import java.util.Vector;
	

	public class TestTea {


	

		public static void main(String[] args) {
		ArrayList<Teacher> a1=new ArrayList<Teacher>();
	Teacher e1=new Teacher(1,"harsha",35000.00);
		Teacher e2=new Teacher(2,"kishor",25000.00);
		Teacher e3=new Teacher(3,"vinay",24000.00);
		Teacher e4=new Teacher(4,"sumukh",15000.00);
		Teacher e5=new Teacher(5,"kiran",45000.00);
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		a1.add(e5);
		for(int i=0;i<a1.size();i++) {
			Teacher e=a1.get(i);
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		System.out.println("==for each=====");
		for(Object o1:a1) {
			System.out.println(o1);
		}
		System.out.println("=====iterator=======");
		Iterator<Teacher> it1=a1.iterator();
		while(it1.hasNext()) {
			Teacher e=it1.next();
			System.out.println(e);
		}
		System.out.println("========listiterator===========");
		ListIterator<Teacher> lit=a1.listIterator();
		while(lit.hasNext()) {
			Teacher e=lit.next();
			System.out.println(e);
		}

		LinkedList<Teacher> l1=new LinkedList<Teacher>();
		Teacher e6=new Teacher(6,"abhi",35000.00);
		Teacher e7=new Teacher(7,"akarsh",25000.00);
		Teacher e8=new Teacher(8,"bharath",24000.00);
		Teacher e9=new Teacher(9,"chethan",15000.00);
		Teacher e10=new Teacher(10,"chandhan",45000.00);
		l1.add(e6);
		l1.add(e7);
		l1.add(e8);
		l1.add(e9);
		l1.add(e10);
		for(int i=0;i<l1.size();i++) {
			Teacher e=l1.get(i);
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		System.out.println("==for each=====");
		for(Object o1:l1) {
			System.out.println(o1);
		}
		System.out.println("=====iterator=======");
		Iterator<Teacher> iit1=l1.iterator();
		while(iit1.hasNext()) {
			Teacher e=iit1.next();
			System.out.println(e);
		}
		System.out.println("========listiterator===========");
		ListIterator<Teacher> lit1=l1.listIterator();
		while(lit1.hasNext()) {
			Teacher e=lit1.next();
			System.out.println(e);
		}

		Vector<Teacher> v=new Vector<Teacher>();
		Teacher e11=new Teacher(11,"darshan",35000.00);
		Teacher e12=new Teacher(12,"dravid",25000.00);
		Teacher e13=new Teacher(13,"dhoni",24000.00);
		Teacher e14=new Teacher(14,"dinda",15000.00);
		Teacher e15=new Teacher(15,"deekshith",45000.00);
		v.add(e11);
		v.add(e12);
		v.add(e13);
		v.add(e14);
		v.add(e15);
		for(int i=0;i<v.size();i++) {
			Teacher e=v.get(i);
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		System.out.println("==for each=====");
		for(Object o1:v) {
			System.out.println(o1);
		}
		System.out.println("=====iterator=======");
		Iterator<Teacher> it2=v.iterator();
		while(it2.hasNext()) {
			Teacher e=it2.next();
			System.out.println(e);
		}
		System.out.println("========listiterator===========");
		ListIterator<Teacher> lit2=v.listIterator();
		while(lit2.hasNext()) {
			Teacher e=lit2.next();
			System.out.println(e);
		}

		
		Stack<Teacher> s=new Stack<Teacher>();
		Teacher e16=new Teacher(16,"harsha",35000.00);
		Teacher e17=new Teacher(17,"kishor",25000.00);
		Teacher e18=new Teacher(18,"vinay",24000.00);
		Teacher e19=new Teacher(19,"sumukh",15000.00);
		Teacher e20=new Teacher(20,"kiran",45000.00);
		s.add(e16);
		s.add(e17);
		s.add(e18);
		s.add(e19);
		s.add(e20);
		for(int i=0;i<s.size();i++) {
			Teacher e=s.get(i);
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		System.out.println("==for each=====");
		for(Object o1:s) {
			System.out.println(o1);
		}
		System.out.println("=====iterator=======");
		Iterator<Teacher> it3=s.iterator();
		while(it3.hasNext()) {
			Teacher e=it3.next();
			System.out.println(e);
		}
		System.out.println("========listiterator===========");
		ListIterator<Teacher> lit3=a1.listIterator();
		while(lit3.hasNext()) {
			Teacher e=lit3.next();
			System.out.println(e);
		}

		



		}

	}



