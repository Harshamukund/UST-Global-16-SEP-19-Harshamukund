package com.ustglobal.java8features.function;

import java.util.function.Function;

public class TestA {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i ->i*i;
		
		int res=f.apply(5);
		System.out.println("result for 5 "+res);
		
		int res1=f.apply(4);
		System.out.println("result for 4 "+res1);
	}

}
