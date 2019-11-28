package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40};
		recieve(nums);
		int[] v=getArray();
		for(int v2: v) {
			System.out.println(v2);
		}


	}
	static void recieve(int[] nums) {
		for(int num:nums) {
			System.out.println(num);

		}}
	static int[] getArray(){
		int[] values= {10,20,30};
		return values;
	}
}


