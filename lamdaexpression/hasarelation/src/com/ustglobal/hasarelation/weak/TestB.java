package com.ustglobal.hasarelation.weak;

public class TestB {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.color);;
		c.move();
		//Has a relation
		System.out.println(c.m.size);
		c.m.play();
		c.m.stop();
		

	}

}
