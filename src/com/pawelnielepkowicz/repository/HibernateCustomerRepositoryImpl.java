package com.pawelnielepkowicz.repository;

import java.util.*;

import com.pawelnielepkowicz.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	// someValue taken from app.config
	//@Value("${someValue}")
	private String someValue;
	@Override
	public List<Customer> findAll(){
		
		
		
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		
		customer.setFirstname("Pawel");
		customer.setLastname("Nielepkowicz");
		//customer.setLastname(someValue);
		customers.add(customer);
		return customers;
	}

}
