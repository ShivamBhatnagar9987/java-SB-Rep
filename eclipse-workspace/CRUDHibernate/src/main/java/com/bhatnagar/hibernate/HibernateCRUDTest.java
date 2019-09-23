package com.bhatnagar.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhatnagar.model.UserDetails;

public class HibernateCRUDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
//			for (int i = 0; i < 10; i++) {
//				UserDetails user = new UserDetails();
//				user.setUserName("User " + i);
//				session.save(user);
//			}
			// UserDetails user = (UserDetails) session.get(UserDetails.class, 2); //id 2 is
			// deleted
			// session.delete(user);
			// UserDetails user = (UserDetails) session.get(UserDetails.class, 5);
			// user.setUserName("Updated User");
			// session.update(user);
			// System.out.println("getData: " + user.getUserId() + " " +
			// user.getUserName());

			// List<String> listUserNames = new ArrayList<>();
			List<Map> hashMap = new ArrayList<>();
			// Query query = session.createQuery("select userName from UserDetails");
			Query query = session.createQuery("select new map(userId,userName,userAddress) from UserDetails");
			query.setFirstResult(1);
			query.setMaxResults(6);
			// listUserNames = query.list();
			hashMap = query.list();
			Iterator it = hashMap.iterator();
			while (it.hasNext()) {
				HashMap<Integer, Integer> hm = (HashMap) it.next();
				System.out.println(hm.get("0") + "->" + hm.get("1") + " :" + hm.get("2"));

			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}

}
