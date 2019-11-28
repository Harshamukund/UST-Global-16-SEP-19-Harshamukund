package com.ustglobal.threads;

public class TestRunnable {

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();

		Thread t=new Thread(mr);
		
		t.start();
		for(int j=0;j<12;j++) {
			System.out.println("main thread");
		}
				

	}

}
