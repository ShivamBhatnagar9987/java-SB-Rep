package com.bhatnagar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.dao.JdbcDaoImpl;
import com.bhatnagar.model.User;

public class SpringJdbcDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcDaoImpl j = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		User u=j.getUser();
		System.out.println(u.getName());
	}
}
