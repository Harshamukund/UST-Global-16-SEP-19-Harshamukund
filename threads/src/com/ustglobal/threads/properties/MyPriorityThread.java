package com.ustglobal.threads.properties;

public class MyPriorityThread extends Thread {

	public static void main(String[] args) {
		System.out.println("main started");
		int p=Thread.currentThread().getPriority();
		System.out.println("priority of current thread is "+p);
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority is "+Thread.currentThread().getPriority());
		MyPriorityThread t=new MyPriorityThread();
		int q=t.getPriority();
		System.out.println("myprioritythread priority is "+q);
		System.out.println(Thread.currentThread().getPriority());
		t.setPriority(8);
		System.out.println("childclass thread priority is "+t.getPriority());
		System.out.println("main ended");
	
	}

}
