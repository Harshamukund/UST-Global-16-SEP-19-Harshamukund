package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p=new Pen();
		int ph1=p.hashCode();
		System.out.println("hashcode of p "+ph1);
		
		Pen q=new Pen();
		int ph2=q.hashCode();
		System.out.println("address of q "+q);
		System.out.println("hashcode of q "+ph2);
	}

}
