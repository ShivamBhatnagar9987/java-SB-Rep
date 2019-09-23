package com.bhatnagar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhatnagar.model.UserDetails;
import com.bhatnagar.model.Vehicle;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		Vehicle vehicle = new Vehicle();
		user.setUserName("elijah mikaelson");
		vehicle.setVehicleName("Nissan Sunny");
		user.setVehicle(vehicle);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory(); // 1. create Session Factory Object
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.save(vehicle);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}
}
