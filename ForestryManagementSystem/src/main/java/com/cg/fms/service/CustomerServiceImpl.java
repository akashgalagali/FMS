package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.CustomerDao;
import com.cg.fms.dto.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao cdao;
	
	@Override
	public Optional<Customer> serviceGetCustomer(String customerId) {
		
		return cdao.findById(customerId);
	}

	@Override
	public Customer serviceAddCustomer(Customer customer) {
		return cdao.save(customer);
	}

	@Override
	public Customer serviceUpdateCustomer(Customer customer) {
		return cdao.save(customer);
	}

	@Override
	public Customer serviceDeleteCustomer(String customerId) {
		cdao.deleteById(customerId);
		return null;
	}

	@Override
	public List<Customer> serviceGetAllCustomers() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

}
