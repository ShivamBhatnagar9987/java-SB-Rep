package com.shivambhatnagar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shivambhatnagar.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service=appContext.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
