package com.bhatnagar.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.dao.JdbcDaoImpl;
import com.bhatnagar.model.User;

public class SpringJdbcDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcDaoImpl j = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		// User u = j.getUser();
		// User u=j.getUserName();
		// User u = j.getUserForId();
		// System.out.println(u.getName());
		System.out.println(j.getAllUsers().size());
		@SuppressWarnings("unchecked")
		List<User> userList = j.getAllUsers();
		Iterator<User> it = userList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}
}