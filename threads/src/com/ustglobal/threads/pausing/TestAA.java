package com.ustglobal.threads.pausing;

public class TestAA {
	public static void main(String[] args) {
		
	
	Object obj1=new Object();
	Object obj2=new Object();
	Runnable r1=()->{
	
	synchronized (obj1){
		System.out.println("T1 started");
	
		System.out.println("T1 has locked obj1");
		synchronized (obj2) {
			System.out.println("T2 started");
			System.out.println("T2 has locked obj2");
		}
	}
	System.out.println("T2 finished");
	};
	Runnable r2=()->{
		synchronized (obj2) {
			System.out.println("T2 started");
			System.out.println("T2 has locked obj1");
			synchronized (obj1) {
				System.out.println("T2 has locked obj1");
				
			}
		}
		System.out.println("T2 has finished");
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	
	
	
	
	}

}
