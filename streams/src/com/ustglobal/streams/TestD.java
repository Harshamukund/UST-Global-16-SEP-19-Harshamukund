package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(20);
		a1.add(23);
		a1.add(5);
		a1.add(12);
		a1.add(4);
		a1.add(24);
		Comparator<Integer> cmp=(m1,m2)->{
			if(m1>m2){
				return 1;
			}
			else if(m1<m2){
				return -1;
			}
			else {
				return 0;
			}
		};
	long no=	a1.stream().filter(i->i<40).count();
		System.out.println(no);
		System.out.println("==============");
		Integer i=a1.stream().min(cmp).get();
		System.out.println("minimum number "+i);
		Integer j=a1.stream().max(cmp).get();
		System.out.println("maximum number "+j);



	}

}
