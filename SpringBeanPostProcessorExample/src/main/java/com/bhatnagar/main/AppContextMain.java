package com.bhatnagar.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.model.BeanClass;

public class AppContextMain {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanClass beanClass = applicationContext.getBean("myBean", BeanClass.class);
		beanClass.getMessage();
		applicationContext.registerShutdownHook();
		applicationContext.close();
	}

}
