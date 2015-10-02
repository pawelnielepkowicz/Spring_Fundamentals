package com.pawelnielepkowicz.repository;

import java.util.List;

import com.pawelnielepkowicz.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}