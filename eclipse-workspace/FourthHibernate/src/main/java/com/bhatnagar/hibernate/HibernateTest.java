package com.bhatnagar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhatnagar.model.UserDetails;
import com.bhatnagar.model.Vehicle;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle3 = new Vehicle();
		Vehicle vehicle4 = new Vehicle();
		user.setUserName("elijah mikaelson");
		vehicle1.setVehicleName("nissan sunny");
		vehicle2.setVehicleName("mercedes benz");
		vehicle3.setVehicleName("audi");
		vehicle4.setVehicleName("bmw");
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		user.getVehicle().add(vehicle3);
		user.getVehicle().add(vehicle4);
		vehicle1.setUser(user);
		vehicle2.setUser(user);
		vehicle3.setUser(user);
		vehicle4.setUser(user);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory(); // 1. create Session Factory Object
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.save(vehicle1);
			session.save(vehicle2);
			session.save(vehicle3);
			session.save(vehicle4);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}
}
