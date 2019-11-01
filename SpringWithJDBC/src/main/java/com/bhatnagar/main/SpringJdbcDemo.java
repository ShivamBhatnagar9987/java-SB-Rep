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
		// System.out.println(j.getAllUsers().size());
		@SuppressWarnings("unchecked")
		List<User> userList = j.getAllUsers();
		Iterator<User> it = userList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		User user1 = new User();
		user1.setId(4 + "");
		user1.setName("inserted from spring using jdbcTemplate");
		// j.insertUser(user1);
		User user2 = new User();
		user2.setId(5 + "");
		user2.setName("inserted from spring using namedParameterJdbcTemplate");
		j.insertUserNamedParam(user2);

	}
}