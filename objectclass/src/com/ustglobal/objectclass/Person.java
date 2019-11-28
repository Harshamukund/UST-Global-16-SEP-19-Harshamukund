package com.ustglobal.objectclass;

public class Person implements Cloneable{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	

}
