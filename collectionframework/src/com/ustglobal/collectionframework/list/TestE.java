package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("shreya");
	Object o=a1.get(0);
	System.out.println(o);
	String s=(String) o;
	String s1=s.toUpperCase();
	System.out.println(s1);

	}

}
