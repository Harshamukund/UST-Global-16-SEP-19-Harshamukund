package com.ustglobal.exception.customisedcheckedexception;

public class TestAmount {

	public static void main(String[] args) {
	System.out.println("main started");
	ValidateAmount v=new ValidateAmount();
	try {
		v.checkAmount(20000);
		System.out.println("withdraw ur amount");
	} catch (InvalidAmountException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
	
	System.out.println("main ended");

	}

}
