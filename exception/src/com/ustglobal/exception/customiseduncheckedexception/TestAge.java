package com.ustglobal.exception.customiseduncheckedexception;

public class TestAge {

	public static void main(String[] args) {
		System.out.println("main started");
	Validator v=new Validator();
	try {
	v.verify(16);
	}catch(InvalidAgeException e) {
		System.out.println("exception occured");
	}
	v.verify(16);
	System.out.println("main ended");

	}

}
