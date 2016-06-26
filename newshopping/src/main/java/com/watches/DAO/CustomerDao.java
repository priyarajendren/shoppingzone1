package com.watches.DAO;

import java.util.List;

import com.watches.model.Customer;

public interface CustomerDao {


	public List<Customer> list();

	public Customer get(String id);

	public void saveOrUpdate(Customer customer);

	public void delete(String id);


}
