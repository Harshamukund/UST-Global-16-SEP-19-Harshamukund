package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("anupama");
		a1.add("savitha");
		a1.add(null);
		a1.add("kavitha");
		a1.add("sunitha");
		String q=a1.get(0);
		System.out.println(q.toUpperCase());
		Iterator<String> li=a1.iterator();
		while(li.hasNext()) {
			String s=li.next();
			System.out.println(s);
		}
		System.out.println("======listiterator==========");
		ListIterator<String> li2= a1.listIterator();
		while(li2.hasNext()) {
			String s1=li2.next();
			System.out.println(s1);
		}
		System.out.println("=foreach=============");
		for(String s3:a1) {
			System.out.println(s3);



		}



	}

}
