package com.ustglobal.exception.customiseduncheckedexception;

public class InvalidAgeException extends RuntimeException{
	String message="invalid age below 18 year not allowed";
	
	
	public InvalidAgeException(String message) {
		
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	

}
