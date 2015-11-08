package com.mycompany.cws.customer.domain;

public class Customer {
	
	private String customerName;
	private String customerId;
	
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}	

}
