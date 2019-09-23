package com.shivambhatnagar.repository;

import java.util.List;

import com.shivambhatnagar.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}