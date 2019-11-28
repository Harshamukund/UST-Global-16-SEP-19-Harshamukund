package com.ustglobal.exception.first;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started");
		int[] a= {20,30,40};
		System.out.println(a[1]);
		try {
		System.out.println(a[3]);
		}
		catch(Exception e) {
/*			e.printStackTrace();
*/			System.out.println("index is not found");
		
		}
		System.out.println("main ended");

	}

}
