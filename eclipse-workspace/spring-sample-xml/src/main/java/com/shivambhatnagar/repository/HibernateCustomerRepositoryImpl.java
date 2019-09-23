package com.shivambhatnagar.repository;

import java.util.ArrayList;
import java.util.List;
import com.shivambhatnagar.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shivambhatnagar.repository.CustomerRepository#findAll()
	 */

	private String dbUsername;

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public List<Customer> findAll() {
		
		System.out.println("dbUsername:: "+dbUsername);
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstname("Shivam");
		customer.setLastname("Bhatnagar");
		customers.add(customer);
		return customers;
	}
}
