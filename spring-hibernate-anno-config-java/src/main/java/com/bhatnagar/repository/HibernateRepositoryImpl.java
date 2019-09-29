package com.bhatnagar.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import com.bhatnagar.model.User;

@Repository("userRepository")
public class HibernateRepositoryImpl implements UserRepository {
	@Override
	public User findAll() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User u = session.get(User.class, "5");
		session.getTransaction().commit();
		return u;
	}
}