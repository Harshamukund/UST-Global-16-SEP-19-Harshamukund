package com.ustglobal.threads.pausing;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
	

}
