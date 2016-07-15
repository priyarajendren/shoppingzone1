package com.watches.service;

import java.util.List;

import com.watches.model.Customer;

public interface CustomerServDAO {


Customer findById(Integer id);
	
	List<Customer> findAll();

	public void saveOrUpdate(Customer c);
	
	public void delete(int id);

	
}
