package com.watches.service;

import com.watches.DAO.CustomerDAO;
import com.watches.DAO.CustomerDAOImpl;
import com.watches.DAO.CustomerDAO;
import com.watches.model.Customer;
import com.watches.model.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unused")
@Service("CustomerService")
public class CustomerService implements CustomerServDAO {


	@Autowired
	private CustomerDAO cd;
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public Customer findById(Integer id) {
		
		return cd.findById(id);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public List<Customer> findAll() {
		List<Customer>all=cd.getItems();
		return all;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void saveOrUpdate(Customer c) {
		cd.save(c);
		
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void delete(int id) {
	cd.delete(id);
	}	
}
