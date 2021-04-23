package com.cg.fms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.Exceptions.NoDataFoundException;
import com.cg.fms.dto.Customer;
import com.cg.fms.service.CustomerServiceImpl;
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerService;

	public CustomerServiceImpl getCustomerDAO() {
		return customerService;
	}

	public void setCustomerDAO(CustomerServiceImpl customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping(value="/all",produces="application/json")
	public  ResponseEntity<List<Customer>> getCustomers(){
		return new ResponseEntity<List<Customer>> (customerService.serviceGetAllCustomers(),HttpStatus.OK);
	}
	
	@GetMapping(value="/{customerId}",produces="application/json")
	public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable("customerId")String custId){ 
    	Optional<Customer> c= customerService.serviceGetCustomer(custId);
    	if(c.isPresent()) {
    		System.out.println(c);
    		return new ResponseEntity<Optional<Customer>>(c,HttpStatus.OK);
    	}
    	else 
    		throw new NoDataFoundException("No Customer found with given Customer ID: "+ custId);
    	
	}

	
	@PostMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> addCustomer(@RequestBody Customer cus){
		customerService.serviceUpdateCustomer(cus);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		
	}
	
	@PutMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> modifyCustomer(@RequestBody Customer cus){
		customerService.serviceUpdateCustomer(cus);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);	
	}
	
	@DeleteMapping(value="/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable("customerId")String customerId)
	{	Optional<Customer> c= customerService.serviceGetCustomer(customerId);
		if(c.isPresent()) {
			customerService.serviceDeleteCustomer(customerId);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	else 
		throw new NoDataFoundException("No Customer found with given Customer ID: "+ customerId+" Customer can not be deleted ");		
	}
}
