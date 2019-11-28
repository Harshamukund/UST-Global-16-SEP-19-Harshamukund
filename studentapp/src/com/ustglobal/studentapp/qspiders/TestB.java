package com.ustglobal.studentapp.qspiders;
import com.ustglobal.studentapp.jspiders.Remote;
public class TestB {
	public static void main(String[] args) {
		Remote.on();
		System.out.println(Remote.num);
		Remote r=new Remote();
		System.out.println(r.sum);
		
		
	}

}
