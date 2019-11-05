package com.bhatnagar.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List getAllUsers() {
		String sql = "from User where id=:id";
		Query query = getSessionFactory().openSession().createQuery(sql);
		query.setString("id", "2");
		List userList = query.list();
		// System.out.println(userList);
		return userList;
	}
}