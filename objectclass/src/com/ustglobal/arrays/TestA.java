package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=20;
		nums[1]=25;
		nums[3]=30;
		nums[4]=35;
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("======foreachloop==============");
		for(int i:nums) {
			System.out.println(i);
		}
		System.out.println("===============================");
		char[] c= {'a','b','c','d'};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("======foreachloop==============");
		for(int ch:c) {
			System.out.println(ch);
		}
		System.out.println("===============================");
		boolean[] b= {true,false,false,true,true};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("======foreachloop==============");
		for(boolean bo:b) {
			System.out.println(bo);
		}
		System.out.println("===============================");
		byte[] bt= {1,2,3,4,5,6,7};
		for(int i=0;i<bt.length;i++) {
			System.out.println(bt[i]);
		}
		System.out.println("======foreachloop==============");
		for(int byt:bt) {
			System.out.println(byt);
		}
		System.out.println("===============================");
		double[] d= {1.0,2.0,3.0,4.5,5.6,7.7};
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("======foreachloop==============");
		for(double dou:d) {
			System.out.println(dou);
		}
		System.out.println("===============================");
		String[] s= {"harsha","amal","jison","hari","krishna"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("======foreachloop==============");
		for(String st:s) {
			System.out.println(st);
		}
		System.out.println("===============================");
		
	}

}
