package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("meowwwwwwwwwwww...");
		
	}

}
