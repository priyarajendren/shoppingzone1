package com.watches.service;

import java.util.List;

import com.watches.model.Customer;

public interface CustomerServDAO {

	

	public void addCustomer(Customer c);
	public void deleteCustomer(int id);
	public void updateCustomer(Customer c);
	public List<Customer> viewAllCustomers();

	
	
}
