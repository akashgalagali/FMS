package com.cg.fms.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Orders;

public interface IOrderDao extends JpaRepository<Orders,String>{

//	public Orders getOrder(String orderNumber);
//
//	public boolean addOrder(Orders order);
//
//	public boolean updateOrder(Orders order);
//
//	public boolean deleteOrder(String orderNumber);
//	
//	public List<Orders> getAllOrders();
}
