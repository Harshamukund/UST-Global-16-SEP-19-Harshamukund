package com.ustglobal.threads.pausing;

public class Slider {
	public static void main(String[] args) {
		System.out.println("main started");
		for(int i=0;i<5;i++) {
			System.out.println("sliding");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
