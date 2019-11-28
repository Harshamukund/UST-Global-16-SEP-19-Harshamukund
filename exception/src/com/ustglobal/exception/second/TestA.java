package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {
		try{Thread.sleep(3000);
		System.out.println("inside try");
		}
		catch(InterruptedException i) {
			System.out.println("exception caught");
			i.printStackTrace();
		}
		System.out.println("main ended");

	}

}
