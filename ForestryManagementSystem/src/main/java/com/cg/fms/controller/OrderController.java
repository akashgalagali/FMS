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

import com.cg.fms.dto.Orders;
import com.cg.fms.service.OrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderServiceImpl orderService=new OrderServiceImpl();
	public OrderServiceImpl getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderServiceImpl orderService) {
		this.orderService = orderService;
	}
	@GetMapping(value="/all",produces="application/json")
	public ResponseEntity<List<Orders>> getAllOrders(){
		System.out.println("it worked");
		return new ResponseEntity<List<Orders>>(orderService.getAllOrders(),HttpStatus.OK);
	}
	@GetMapping(value="/{ordid}",produces="application/json")
	public ResponseEntity<Optional<Orders>> getOrder(@PathVariable("ordid")String ordid){
		Optional<Orders> o=null; 
		o=orderService.getOrder(ordid);
		System.out.println(o.toString());
		if(o.isPresent()) {
    		return new ResponseEntity<Optional<Orders>>(o,HttpStatus.OK);
    	}
    	else 
    		throw new NoDataFoundException("No Order data found with given Order ID: "+ ordid);
	}
	@PostMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> addOrder(@RequestBody Orders odd) {
		orderService.addOrder(odd);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	@PutMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> modifyOrder(@RequestBody Orders odd) {
		orderService.updateOrder(odd);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	@DeleteMapping(value="/{ordid}")
	public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("ordid")String ordid){
		Optional<Orders> o=null; 
		o=orderService.getOrder(ordid);
		if(o.isPresent()) {
			orderService.deleteOrder(ordid);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    	}
    	else 
    		throw new NoDataFoundException("No Order data found with given Order ID: "+ ordid);
	
	}

}
