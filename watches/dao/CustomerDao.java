package com.watches.dao;

import java.util.List;

import com.watches.model.Customer;

public interface CustomerDao {
	

	public List<Customer> getAllDetails();
	public void addCustomer(Customer c);
	public void deleteCustomer(int id);
	public void updateCustomer(int id);
	
	
/*
	public List<Customer> getAllDetails();
	public Customer getAllDetails();
	public void addCustomer	(String firstname, String lastname, String userid, String password);
	public void deleteCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void viewCustomer(Customer customer);
*/
	
	
	
	
}

