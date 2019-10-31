package com.bhatnagar.postProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before init:: " + beanName);
		return bean;

	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after init:: " + beanName);
		return bean;
	}
}