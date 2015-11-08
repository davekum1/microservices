package com.mycompany.cws.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.cws.customer.domain.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomer() {
		List<Customer> customerList = createCustomers();	
		return customerList;
	}
	
	@RequestMapping(value="/findById/{id}", method=RequestMethod.GET)
	public @ResponseBody Customer getCustomer(@PathVariable String id) {
		Customer customer = findCustomer(id);
		if (customer != null) {
			return customer;	
		} else {
			customer = new Customer("Id not found", "Name not found");
			return customer;
		}
	}
	
	/**
	 * Find customer by customerId from static list
	 * @param id
	 * @return
	 */
	private Customer findCustomer(String id) {
		List<Customer> customerList = createCustomers();		
		for (Customer customer : customerList) {
			if (customer.getCustomerId().equals(id)) {
				return customer;
			}
		}		
		return null;
	}

	/**
	 * Create static list of customers
	 * @return
	 */
	private List<Customer> createCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer1 = new Customer("1","Jane");
		Customer customer2 = new Customer("2","Leah");
		Customer customer3 = new Customer("3", "Erza");
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		return customerList;
	}
	
}
