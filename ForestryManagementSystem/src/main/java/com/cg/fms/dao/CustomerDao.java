package com.cg.fms.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Customer;


public interface CustomerDao extends JpaRepository<Customer,String>{
//	public boolean loginCustomer(String customerName, String customerPassword);
//
//	public Customer getCustomer(String customerId);
//
//	public boolean addCustomer(Customer customer);
//
//	public boolean updateCustomer(Customer customer);
//
//	public boolean deleteCustomer(String customerId);
//	
//	public List<Customer> getAllCustomers();
}
