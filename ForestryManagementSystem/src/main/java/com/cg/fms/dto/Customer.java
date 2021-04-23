package com.cg.fms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


//public class Customer{
//	private String customerId;
//	private String customerPassword;
//	private String customerName;
//	private String customerEmail;
//	private String customerAddress;
//	private String customerTown;
//	private String customerPostalCode;
//	private String customerContact;
//}
@Entity
//public class Customer extends User{
public class Customer{
	@Id
	@Column(name="customer_id")
	private String customerId;
	@Column(name="customer_password")
	private String customerPassword;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_email")
	private String customerEmail;
	@Column(name="customer_address")
	private String customerAddress;
	@Column(name="customer_town")
	private String customerTown;
	@Column(name="customer_postal_code")
	private String customerPostalCode;
	@Column(name="customer_contact")
	private String customerContact;
	
	@OneToOne(mappedBy="customerId")
	Orders order;
	@OneToOne(mappedBy="customerId")
	Contract contract;
	
	//@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy="customer")
	//@JoinColumn(name="customerId")
	//List<Orders> order;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String customerPassword, String customerName, String customerEmail,
			String customerAddress, String customerTown, String customerPostalCode, String customerContact ) {
		//super(customerName,customerPassword,"customer");
		this.customerId = customerId;
		this.customerPassword = customerPassword;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerTown = customerTown;
		this.customerPostalCode = customerPostalCode;
		this.customerContact = customerContact;
		//this.order=order;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerTown() {
		return customerTown;
	}
	public void setCustomerTown(String customerTown) {
		this.customerTown = customerTown;
	}
	public String getCustomerPostalCode() {
		return customerPostalCode;
	}
	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerPassword=" + customerPassword + ", customerName="
				+ customerName + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress
				+ ", customerTown=" + customerTown + ", customerPostalCode=" + customerPostalCode + ", customerContact="
				+ customerContact + "]";
	}


}
