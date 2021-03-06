package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import com.cg.fms.dto.Customer;

public interface CustomerService {
	
	public Optional<Customer> serviceGetCustomer(String customerId);

	public Customer serviceAddCustomer(Customer customer);

	public Customer serviceUpdateCustomer(Customer customer);

	public Customer serviceDeleteCustomer(String customerId);

	public List<Customer> serviceGetAllCustomers();
}
