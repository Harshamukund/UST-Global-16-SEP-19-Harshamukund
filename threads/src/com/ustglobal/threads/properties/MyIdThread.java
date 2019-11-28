package com.ustglobal.threads.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		System.out.println("main started");
		System.out.println(Thread.currentThread().getId());
		MyIdThread mi=new MyIdThread();
		System.out.println("myidthread id is "+mi.getId());
		System.out.println(" priority is "+Thread.currentThread().getPriority());
		/*illegal argument exception because 16 is invalid
		Thread.currentThread().setPriority(16);*/
		System.out.println("main ended");

	}

}
