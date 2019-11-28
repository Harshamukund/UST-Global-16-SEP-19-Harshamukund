package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestL {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("abhi");
		a1.add("adhi");
		a1.add("bharath");
		a1.add("chandhan");
		a1.add("chethan");
		a1.add("darshan");
		System.out.println("before sort----> "+a1);
		Collections.sort(a1);
		System.out.println("after sort----> "+a1);

		

	}

}
