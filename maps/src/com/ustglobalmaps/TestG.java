package com.ustglobalmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"abhi",12000);
		Employee e2=new Employee(2,"adhi",2000);
		Employee e3=new Employee(3,"akarshi",13000);
		Employee e4=new Employee(4,"salman",134500);
		Employee e5=new Employee(5,"shoaib",199990);
		Employee e6=new Employee(6,"rakshi",14567);
		Employee e7=new Employee(7,"rakesh",11234);
		Employee e8=new Employee(8,"raman",198765);
		Employee e9=new Employee(9,"ratan",12345);
		ArrayList<Employee> mgr1=new ArrayList<>();
		mgr1.add(e1);
		mgr1.add(e2);
		mgr1.add(e3);
		ArrayList<Employee> mgr2=new ArrayList<>();
		mgr2.add(e4);
		mgr2.add(e5);
		mgr2.add(e6);

		ArrayList<Employee> mgr3=new ArrayList<>();
		mgr3.add(e7);
		mgr2.add(e8);
		mgr2.add(e9);
		HashMap<Integer,ArrayList<Employee>> h=new HashMap<>();
		h.put(1,mgr1);
		h.put(2,mgr2);
		h.put(3, mgr3);
		ArrayList<Employee> a1=h.get(2);
		Iterator<Employee> it=a1.iterator();
		while(it.hasNext()) {
			Employee s=it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("salary is "+s.salary);

		}



		
	}

}
