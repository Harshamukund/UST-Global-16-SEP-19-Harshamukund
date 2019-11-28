package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestK {

	public static void main(String[] args) {
	LinkedList<Integer> i=new LinkedList<Integer>();
	i.add(12);
	i.add(13);
	i.add(15);
	i.add(13);
	i.add(11);
	System.out.println("before sort "+i);
	Collections.sort(i);
	System.out.println("after sort "+i);
	System.out.println("before revers "+i);
	Collections.reverse(i);
	System.out.println("after reverse "+i);
	System.out.println("before shuffle "+i);
	Collections.shuffle(i);
	System.out.println("after shuffle "+i);



	}

}
