package com.ustglobal.exception.customiseduncheckedexception;

public class Validator {
	void verify(int age) {
		if(age<18){
			throw new InvalidAgeException("tryagain next time");
		}
	}

}