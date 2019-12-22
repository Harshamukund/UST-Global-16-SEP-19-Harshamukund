package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;
@Configuration
@Import(PetConfiguration.class)
public class HelloConfiguration {
	@Bean(name="hello")
	/*@Scope("prototype")*/
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMsg("I love Springs");
		return hello;
	}

}
