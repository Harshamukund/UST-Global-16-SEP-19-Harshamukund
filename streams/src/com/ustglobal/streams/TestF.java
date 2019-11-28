package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<>();
		Employee e1=new Employee(1,"veeru");
		Employee e2=new Employee(4,"yuvi");
		Employee e3=new Employee(2,"dhoni");
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		Comparator<Employee> cmp=(e5,e6)->{
			
			return e5.name.compareTo(e6.name);
		};
		List<Employee> l=a1.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> it=l.iterator();
		while(it.hasNext()) {
			Employee ee=it.next();
			System.out.println(ee.name);
		}
	}

}
