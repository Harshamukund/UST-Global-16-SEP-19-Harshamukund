package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(20);
		a1.add(23);
		a1.add(5);
		a1.add(12);
		a1.add(4);
		a1.add(24);
		List<Integer> l=a1.stream().map(i->i*3).collect(Collectors.toList());
		for(Integer i1:l) {
			System.out.println(i1);
		}
	}

	}


