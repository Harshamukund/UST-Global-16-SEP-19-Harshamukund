package com.ustglobal.streams;

import java.util.ArrayList;



public class TestG {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<>();
		new Student(2,"vijay",56.67);
		a1.add(new Student(3,"vinay",36.67));
		a1.add(new Student(10,"sumukh",56.67));
		a1.add(new Student(2,"vijay",56.67));
		Helper h=new Helper();
		h.display(a1);
		h.displayFailed(a1);
	}

}
