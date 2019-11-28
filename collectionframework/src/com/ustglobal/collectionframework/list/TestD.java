package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(190);
		a1.add(444.8);
		a1.add(true);
		a1.add("yash");
		ListIterator li=a1.listIterator();
		System.out.println("===========forforward=========");
		while(li.hasNext()) {
			Object ob=li.next();
			System.out.println(ob);
		}
		System.out.println("=====backward=============");
		while(li.hasPrevious()) {
			Object o=li.previous();
			System.out.println(o);
		}
	}

}
