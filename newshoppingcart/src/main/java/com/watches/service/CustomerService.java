package com.watches.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.watches.dao.CustomerDAO;
import com.watches.model.Customer;
@Service
public class CustomerService implements CustomerServDAO{
	@Autowired
	CustomerDAO cd;

	@Transactional(propagation=Propagation.SUPPORTS)
	public void addCustomer(Customer c) {
		cd.addCustomer(c);
	}

	@Transactional
	public List<Customer> viewAllCustomers() {
		return cd.viewAllCustomers();
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
	cd.delCustomer(id);
	}

	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		cd.updateCustomer(c);
	}
	
}
