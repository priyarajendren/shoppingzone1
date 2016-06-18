package com.watches.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.watches.bean.Customer;
@Repository
public class CustomerDao {
	
	public List<Customer> getAllDetails() {
		

		
		List<Customer> list = new ArrayList<Customer>();
		Customer c1 = new Customer(null, null, 0, null);
		c1.setUserId(12);
		c1.setFirstName("hari");
		c1.setLastName("priya");
		c1.setPassword("niit");

		list.add(c1);
		
		c1.setUserId(13);
		c1.setFirstName("neeru");
		c1.setLastName("rajan");
		c1.setPassword("niit");
		list.add(c1);
		
		c1.setUserId(14);
		c1.setFirstName("arun");
		c1.setLastName("kumar");
		c1.setPassword("niit");
		list.add(c1);
		return  list;
		
}

	public int updateCustomer(Object id)
	{
		
		
		return 1;
	}
	



	}

	
	


	
	