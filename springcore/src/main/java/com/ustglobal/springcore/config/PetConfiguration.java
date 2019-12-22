package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Pet;
@Configuration
public class PetConfiguration {
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name="pet")

	public Pet getPet() {
		Pet p=new Pet();
		p.setName("bittu");
		p.setAnimal(getDog());
	return p;
	}
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
	}


}
