package com.bhatnagar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.dao.JdbcDaoImpl;

public class SpringJdbcDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcDaoImpl j = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		j.getUser();
	}
}
