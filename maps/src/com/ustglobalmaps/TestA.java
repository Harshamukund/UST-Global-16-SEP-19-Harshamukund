package com.ustglobalmaps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("kuku", 998014);
		m.put("mala", 89678);
		m.put("sheela", 123014);
		m.put("kuku", 653014);
		System.out.println("data "+m);
		m.put("mala", 666666);
		System.out.println("after modify "+m);
		m.put("hari", 666666);
		System.out.println("data after duplicate value "+m);
		m.put("dimple", null);
		
		System.out.println("data after adding null "+m);
		
			m.put("venilla", null);
		
		System.out.println("data after adding multipe null "+m);
		Object obj=m.get("sheela");
		System.out.println("value "+obj);
		Object obj1=m.get("she");
		System.out.println("value "+obj1);
		Object obj3=m.get(653014);
		System.out.println("value "+obj3);
		Object obj4=m.get(1111);
		System.out.println("value "+obj4);




		

	}

}
