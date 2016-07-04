package com.watches.dao;

import java.util.List;

import com.watches.model.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer c);
	public void delCustomer(int id);
	public void updateCustomer(Customer c);
	public List<Customer> viewAllCustomers();

}
