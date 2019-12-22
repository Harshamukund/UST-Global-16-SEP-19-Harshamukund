package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorClass implements BeanPostProcessor {
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("bean before initialisation: "+beanName);
	return bean;
}
@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
	System.out.println("bean after initialisation: "+beanName);
	return bean;

		
	}
	
}
