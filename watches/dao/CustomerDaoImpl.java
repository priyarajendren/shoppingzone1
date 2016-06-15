package com.watches.dao;

import java.util.ArrayList;
import java.util.List;

import com.watches.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
List<Customer> customers;
public CustomerDaoImpl() {
	customers = new ArrayList<Customer>();
	Customer customer1=new Customer("hari","priya",101,"niit");
	Customer customer2=new Customer("harik","priyav",102,"niitt");
	customers.add(customer1);
	customers.add(customer2);	
}
@Override
public List<Customer> getAllDetails() {
	
	return customers;
}
@Override
public void addCustomer(Customer c) {
	c.setFirstName("hari");
	c.setLastName("priya");
	c.setUserId(101);
	c.setPassword("niit");
	System.out.println("added");
	
}
@Override
public void deleteCustomer(int id) {
	customers.remove(101) ;
	System.out.println(" deleted");
}
@Override
public void updateCustomer(int id) {
	
	customers.get(101).setUserId(210);
	System.out.println("customer:usedid"+ customers.get(210)+" ,updated");
}


}
