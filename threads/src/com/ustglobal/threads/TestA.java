package com.ustglobal.threads;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main Started");
		MyThread t=new MyThread();
		t.start();
		/*if u call start() method multiple times compiler throws illegal thread state exception*/
		//t.start();
		
		/*dont call run method it behaves as normal program
		 * all code will be executed in main thread only
*/	
		//t.run();
		for(int j=0;j<15;j++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");

	}

}
