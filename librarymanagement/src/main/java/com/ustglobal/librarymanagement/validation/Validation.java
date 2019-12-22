package com.ustglobal.librarymanagement.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@!#$%]).{8})");
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}


}
