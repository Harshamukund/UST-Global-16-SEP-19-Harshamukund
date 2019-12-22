package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ComponentScanConfiguration;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		Hello hello=context.getBean(Hello.class);
		hello.setMsg("i love java");
		System.out.println(hello.getMsg());
		
		Pet pet=context.getBean(Pet.class);
		pet.setName("arya");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		

	}

		
		

	}


