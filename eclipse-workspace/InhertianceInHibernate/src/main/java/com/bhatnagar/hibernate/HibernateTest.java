package com.bhatnagar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhatnagar.model.FourWheeler;
import com.bhatnagar.model.TwoWheeler;
import com.bhatnagar.model.UserDetails;
import com.bhatnagar.model.Vehicle;

public class HibernateTest {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory(); // 1. create Session Factory Object
		Session session = sessionFactory.openSession();
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Generic Vehicle");
		TwoWheeler tvehicle = new TwoWheeler();
		tvehicle.setVehicleName("Bike");
		tvehicle.setSteeringHandle("Steering Bike");
		FourWheeler fvehicle = new FourWheeler();
		fvehicle.setVehicleName("Car");
		fvehicle.setSteeringWheel("Steering Wheel");
		try {
			session.beginTransaction();
			session.save(vehicle);
			session.save(tvehicle);
			session.save(fvehicle);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}
}
