package com.shivambhatnagar.service;

import java.util.List;

import com.shivambhatnagar.model.Customer;
import com.shivambhatnagar.repository.CustomerRepository;
import com.shivambhatnagar.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.shivambhatnagar.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
