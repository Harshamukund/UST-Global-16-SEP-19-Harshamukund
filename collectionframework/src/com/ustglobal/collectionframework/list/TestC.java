package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(130);
		a1.add(2934.8);
		a1.add(true);
		a1.add("chinnarri");

		Iterator it=a1.iterator();
		Object o1=it.next();
		System.out.println("obj1 "+o1);

		Object o2=it.next();
		System.out.println("obj2 "+o2);

		Object o3=it.next();
		System.out.println("obj3 "+o3);

		Object o4=it.next();
		System.out.println("obj4 "+o4);
		Boolean b=it.hasNext();
		System.out.println("has next "+b);

		/*Object o5=it.next();
		System.out.println("obj5 "+o5);
		no such element exception
		 */


		for(int i=0;i<a1.size();i++) {
			Object o=a1.get(i);
			System.out.println(o);
		}
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(233.44);
		al.add("momo");
		al.add(false);

		System.out.println("====using iterator=========");
		Iterator it1=al.iterator();
		while(it1.hasNext()) {
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("===for loop========");
		for(;it1.hasNext();) {
			Object ob=it1.next();
			System.out.println(ob);	
		}

	}





}

