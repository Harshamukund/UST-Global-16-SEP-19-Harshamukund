package com.ustglobalmaps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("kuku", 998014);
		m.put("mala", 89678);
		m.put("sheela", 123014);
		m.put("kuku", 653014);
		m.put("mala", 666666);
		HashMap m1=new HashMap();
		m1.put("deepu", 789099);
		m1.put("divya", 678987);
		boolean hashkey=m.containsKey("mala");
		System.out.println("has key "+hashkey);
		
		boolean hasvalue=m.containsValue(998014);
		System.out.println("has value "+hasvalue);
		
		m.putAll(m1);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		m.clear();
		System.out.println(m);



	}

}
