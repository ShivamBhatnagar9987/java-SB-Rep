package com.shivambhatnagar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivambhatnagar.model.Customer;
import com.shivambhatnagar.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
//@Autowired
	private CustomerRepository customerRepository;
//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
	this.customerRepository = customerRepository;
}
@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.shivambhatnagar.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
