package com.bhatnagar.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhatnagar.model.Address;
import com.bhatnagar.model.UserDetails;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		// user.setUserId(1);
		user.setUserName("elijah mikaelson");
		user.setDescription("test description");
		user.setJoinedDate(new Date());
		Address address1 = new Address();
		address1.setCity("userCity for user test data");
		address1.setStreet("userStreet for test data");
		address1.setState("Delhi");
		address1.setPincode("334433");
		Address address2 = new Address();
		address2.setCity("userCity for user2 test data");
		address2.setStreet("userStreet for test2 data");
		address2.setState("Delhi2");
		address2.setPincode("3344332");
		Address address3 = new Address();
		address3.setCity("userCity for user3 test data");
		address3.setStreet("userStreet for test3 data");
		address3.setState("Delhi3");
		address3.setPincode("3344333");

		// Set<Address> listOfAddress = new HashSet<Address>();
		user.getListOfAddress().add(address1);
		user.getListOfAddress().add(address2);
		user.getListOfAddress().add(address3);
//		user.setAddress(address);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory(); // 1. create Session Factory Object
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		user = (UserDetails) session.get(UserDetails.class, 1);
//		System.out.println("Retrieved object:: " + user.getUserName());
//		System.out.println("Retrieved object address:: " + user.getAddress().getState());
	}
}
