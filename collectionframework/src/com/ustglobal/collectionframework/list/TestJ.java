package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestJ {

	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(34.5);
		a1.add(24.5);
		a1.add(44.5);
		a1.add(34.5);
		a1.add(null);
		a1.add(null);
		a1.add(34.5);
		System.out.println(a1);
		System.out.println(" add(ind,obj)");
		a1.add(2,56.55);
		System.out.println(a1);
		System.out.println("remove(ind)");
		a1.remove(3);
		System.out.println(a1);
		System.out.println("remove(obj)");
		a1.remove(null);
		System.out.println(a1);
		System.out.println("get(index)");
		Double val=a1.get(4);
		System.out.println(val);
		a1.set(2, 77.77);
		System.out.println(a1);
		a1.clear();
System.out.println(a1);
a1.contains(56.55);

List<Double> l1=new ArrayList<>();
l1.add(13.33);
l1.add(14.44);
l1.add(15.55);
a1.addAll(l1);
System.out.println("After addall "+l1);

boolean contain=a1.containsAll(l1);
System.out.println("contains all of l1"+contain);

boolean res=a1.removeAll(l1);
System.out.println("remove all of l1 "+res);


	}

}
