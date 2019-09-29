package com.bhatnagar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.model.User;
import com.bhatnagar.service.UserService;

public class MainClassTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = appContext.getBean("userService", UserService.class);
		User u = userService.findAll();
		System.out.println("Country:" + u.getCountry());
	}
}