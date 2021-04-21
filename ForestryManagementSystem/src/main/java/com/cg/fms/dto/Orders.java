package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//public class Orders{
//	private String orderNumber;
//	private Contract contract;
//	private Customer customer;
//	private Product product;
//	private String deliveryPlace;
//	private String deliveryDate;
//	private String quantity;
//	private Scheduler scheduler;
//}
@Entity
@Table(name="orders")
public class Orders{
	@Id
	@Column(name="order_number")
	private String orderNumber;
	@Column(name="delivery_place")
	private String deliveryPlace;
	@Column(name="delivery_date")
	private String deliveryDate;
	@Column(name="quantity")
	private String quantity;
	@OneToOne
	@JoinColumn(name="contract_number")
	private Contract contractNumber;
	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer customerId;
	@OneToOne
	@JoinColumn(name="product_id")
	private Product productId;
	@OneToOne
	@JoinColumn(name="scheduler_id")
	private Scheduler schedulerId;
	public Orders() {}
	public Orders(String orderNumber, String deliveryPlace,
			String deliveryDate, String quantity) {
		super();
		this.orderNumber = orderNumber;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		}
	
	public Orders(String orderNumber, Product product, String deliveryPlace,
			String deliveryDate, String quantity, Scheduler scheduler,Customer customer,Contract contract) {
		super();
		this.orderNumber = orderNumber;
		this.contractNumber = contract;
		this.customerId = customer;
		this.productId = product;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		this.schedulerId = scheduler;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Contract getContract() {
		return contractNumber;
	}
	public void setContract(Contract contract) {
		this.contractNumber = contract;
	}
	public Customer getCustomer() {
		return customerId;
	}
	public void setCustomer(Customer customer) {
		this.customerId = customer;
	}
	public Product getProduct() {
		return productId;
	}
	public void setProduct(Product product) {
		this.productId = product;
	}
	public String getDeliveryPlace() {
		return deliveryPlace;
	}
	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Scheduler getScheduler() {
		return schedulerId;
	}
	public void setScheduler(Scheduler scheduler) {
		this.schedulerId = scheduler;
	}
	@Override
	public String toString() {
		return "Orders [orderNumber=" + orderNumber + ", product="
				+ productId + ", deliveryPlace=" + deliveryPlace + ", deliveryDate=" + deliveryDate + ", quantity="
				+ quantity + ", scheduler=" + schedulerId +"customer"+customerId+"Contract"+contractNumber +"]";
	}
	
}