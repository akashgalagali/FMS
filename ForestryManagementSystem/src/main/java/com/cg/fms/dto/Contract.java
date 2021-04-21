package com.cg.fms.dto;
import javax.persistence.Column;
//public class Contract{
//	
//	private String contractNumber;
//	private Customer customer;
//	private Product product;
//	private String deliveryPlace;
//	private String deliveryDate;
//	private String quantity;
//	private Scheduler scheduler;
//}
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Contract{
	@Id 
	@Column(name="contract_number")
	private String contractNumber;
	@Column(name="delivery_place")
	private String deliveryPlace;
	@Column(name="delivery_date")
	private String deliveryDate;
	@Column(name="quantity")
	private String quantity;
	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer customerId;
	@OneToOne
	@JoinColumn(name="product_id")
	private Product productId;
	@OneToOne
	@JoinColumn(name="scheduler_id")
	private Scheduler schedulerId;
	@OneToOne(mappedBy="contractNumber")
	Orders order;
	public Contract(){}
	
	public Contract(String contractNumber, String deliveryPlace,
			String deliveryDate, String quantity) {
		super();
		this.contractNumber = contractNumber;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		
	}

	public Contract(String contractNumber, Customer customer, Product product, String deliveryPlace,
			String deliveryDate, String quantity, Scheduler scheduler) {
		super();
		this.contractNumber = contractNumber;
		this.customerId = customer;
		this.productId = product;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		this.schedulerId = scheduler;
	}
	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
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
	

}
