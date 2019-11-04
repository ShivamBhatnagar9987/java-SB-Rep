package com.bhatnagar.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.dao.HibernateDaoImpl;
import com.bhatnagar.model.User;

public class SpringJdbcDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HibernateDaoImpl j = applicationContext.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		List userList = j.getAllUsers();
		Iterator<User> it = userList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}
}