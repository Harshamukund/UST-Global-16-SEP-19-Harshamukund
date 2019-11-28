package com.ustglobal.threads.properties;

public class MyThread extends Thread {
	public static void main(String[] args) {
		System.out.println("main started");
		String tname=Thread.currentThread().getName();
		System.out.println("current thread "+tname);
		
		Thread.currentThread().setName("Bala");
		
		
		
		MyThread t1=new MyThread();
		String mname=t1.getName();
		System.out.println("my thread name "+mname);
		t1.setName("goku");
		System.out.println("my new thread name is "+t1.getName());
		
		
		System.out.println(10/0);
		System.out.println("Main ended");
	}

}
