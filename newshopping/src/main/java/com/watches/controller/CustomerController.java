package com.watches.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.watches.DAO.CustomerDao;
import com.watches.model.Customer;



@Controller
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;
	

	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(@ModelAttribute Customer customer) {
		customerDao.saveOrUpdate(customer);
	  return new ModelAndView("/adminHome");
	 }

	
	
	
	@RequestMapping("/getAllCustomers")
	public ModelAndView getAllCustomers() {

		System.out.println("getAllCustomers");
		
		List<Customer> customerList = customerDao.list();
		
		ModelAndView mv = new ModelAndView("/customerList");
		mv.addObject("customerList", customerList);

		return mv;
	}
	
	
	@RequestMapping("/updateCustomers")
	public ModelAndView updateCustomer(@ModelAttribute("customer") ArrayList<Customer> customers)
	{
		Customer c =customers.get(0);
		customerDao.saveOrUpdate(c);
		
		System.out.println("updating category");
		ModelAndView mv = new ModelAndView("/customerList");
		
	    List<Customer> customerList = customerDao.list();
		mv.addObject("customerList", customerList);
		
		return mv;
	}

}
