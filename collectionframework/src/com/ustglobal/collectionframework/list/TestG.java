package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("anupama");
		l1.add("savitha");
		l1.add(null);
		l1.add("kavitha");
		l1.add("sunitha");
		System.out.println("=for loop=====");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("=======foreach==========");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		System.out.println("=using iterator=======");
		Iterator it=l1.iterator() ;
		while(it.hasNext()) {
			Object o2=it.next();
			System.out.println(o2);
		}
		System.out.println("======Listiteratorforward=======");
		ListIterator lit=l1.listIterator() ;
		while(lit.hasNext()) {
			Object o3=lit.next();
			System.out.println(o3);
		}
		
			System.out.println("======Listiteratorbackward=======");
			ListIterator lit2=l1.listIterator() ;
			while(lit2.hasPrevious()) {
				Object o4=lit2.previous();
				System.out.println(o4);
			
			
		}
	}
}
