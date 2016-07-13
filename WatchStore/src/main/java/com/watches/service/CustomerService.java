package com.watches.service;

import com.watches.DAO.CustomerDAO;
import com.watches.DAO.CustomerDAOImpl;
import com.watches.model.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unused")
@Service("CustomerService")
public class CustomerService implements CustomerServDAO {

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
    @Transactional
	public void deleteCustomer(int id) {
		
	cd.delCustomer(id);
	}
    @Transactional
	public void updateCustomer(Customer c) {
		cd.updateCustomer(c);
	}
	
}
