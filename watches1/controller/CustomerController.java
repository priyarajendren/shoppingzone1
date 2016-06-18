package com.watches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.watches.bean.Customer;
import com.watches.dao.CustomerDao;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDaO;
	private Object id;
	
@RequestMapping("/addCustomer")
public ModelAndView addCustomer(@RequestParam(value = "firstname") String firstname,
		@RequestParam(value = "lastname") String lastname,@RequestParam(value = "userid") String userid,@RequestParam(value = "password") String password) {

	System.out.println("addCustomer");
	String message = "Successfully added";
	ModelAndView mv = new ModelAndView("/success");
	mv.addObject("message", message);

	return mv;
}
	
	@RequestMapping("/getAlldetails")
	public ModelAndView getAllDetails() {

		System.out.println("getAlldetails");
		
		List<Customer> customerList = customerDaO.getAllDetails();
		
		ModelAndView mv = new ModelAndView("/customerList");
		mv.addObject("customerList", customerList);

		return mv;
	}
		
		@RequestMapping("/updatecustomers")
		public ModelAndView updateCustomer() {
			int count = customerDaO.updateCustomer( id );
			System.out.println("updating customers");
			ModelAndView mv = new ModelAndView("/customerList");
			String message = count + " record(s) are updated";
			
		    List<Customer> customerList = customerDaO.getAllDetails();
			mv.addObject("message",message);
			mv.addObject("customerList", customerList);
			
			return mv;
			
			
		

		
}
}
