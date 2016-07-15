package com.watches.DAO;

import java.util.List;

import com.watches.model.Customer;

public interface CustomerDAO {
	
	public Customer findById(Integer id);
	public List<Customer> getItems();
	public void save(Customer c);
	public void update(Customer c);
	public void delete(int id);
	
}
