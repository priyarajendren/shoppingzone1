package com.watches.controller;

import javax.validation.Valid;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.watches.model.Customer;
import com.watches.model.Product;
import com.watches.service.CustomerServDAO;
import com.watches.service.ProductServDAO;

@SuppressWarnings("unused")
@Controller
public class WatchController {
	ModelAndView m = new ModelAndView();
	

	@Autowired
	CustomerServDAO cobj;
	@Autowired
	ProductServDAO pobj;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView gohome(){
		System.out.println("-----Home Controller-----");
		m.setViewName("index");
		return m;
	}
		
	@RequestMapping("/login")
	public ModelAndView culog(){
		System.out.println("-----LOGIN Controller-----");
		ModelAndView m = new ModelAndView();
		m.setViewName("login");
		return m;
		
	}
	
	
	@RequestMapping("/aboutus")
	public ModelAndView aboutus(){
		m.setViewName("aboutus");
		return m;
	}
	
	@RequestMapping("/watch1")
	public ModelAndView watch1(){
		m.setViewName("watch1");
		return m;
	}
	
	@RequestMapping("/watch2")
	public ModelAndView watch2(){
		m.setViewName("watch2");
		return m;
	}
	
	@RequestMapping("/watch3")
	public ModelAndView watch3(){
		m.setViewName("watch3");
		return m;
	}
	
	@RequestMapping("/watch4")
	public ModelAndView watch4(){
		m.setViewName("watch4");
		return m;
	}
	

	 @RequestMapping(value="/allProducts", method=RequestMethod.GET)
	 public ModelAndView show1() {
		 ModelAndView m1 = new ModelAndView("allProducts");	
		 
		 System.out.println("Welcome to the allproducts");
		 return m1;
		 } 
		 
	 
	 @RequestMapping(value="/allCustomers", method=RequestMethod.GET)
	 public ModelAndView allCust() {
		 ModelAndView m1 = new ModelAndView("allCustomers");	
		 
		 System.out.println("Welcome to the allCustomers");
		 return m1;
		 } 
		 
	 
	 
	 @RequestMapping(value="/brands", method=RequestMethod.GET)
	 public ModelAndView brands() {
		 ModelAndView m1 = new ModelAndView("brands");	
		 
		 System.out.println("Welcome to the brands of products");
		 return m1;
		 } 
	 
	 
	 
	 @RequestMapping(value = "/logout", method = RequestMethod.GET)
		public ModelAndView lgot() {
			System.out.println("-----Log Controller-----");
			m.setViewName("logout");
			return m;
		}

		
		
		

	 @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
		public ModelAndView gohome1() {
			System.out.println("-----Access Controller-----");
			m.setViewName("accessdenied");
			return m;
		}
	 
	 
	 
	 

		
		@RequestMapping("/cindex")
		public ModelAndView custindex(){
			m.setViewName("cindex");
			return m;
		}
		
		@RequestMapping("/aindex")
		public ModelAndView adindex(){
			m.setViewName("aindex");
			return m;
		}
		

		
	/*
	 * Customer controller details	
	 */
		
		

	 	@ModelAttribute("cust")
		public Customer getCust(){
			return new Customer();
		}
		
	 	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
		public ModelAndView signup() {
			System.out.println("-----Signup Controller-----");
			m.setViewName("signUp");
			// m.addObject("command", new Customer());
			return m;
		}
	 	
	 	
@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
		public String addCustomerdetails(@ModelAttribute("cust")@Valid Customer cust,BindingResult result){
			
			try{
			cobj.saveOrUpdate(cust);
			} catch (Exception e) {

			}
			// ModelAndView m = new ModelAndView("result");
			if (result.hasErrors()) {
				// m.addObject("command", new Customer());
				return "signUp";
			}

			else

				return "login";
		}

	
@RequestMapping(value="/showAddCust",method=RequestMethod.GET)
public ModelAndView showAddCust(){
	m.setViewName("signUp");
	m.addObject("command", new Customer());
	return m;
}

	/*	@RequestMapping(value = "/viewCustomers", method = RequestMethod.GET)
		public ModelAndView viewuser() {
			ModelAndView m = new ModelAndView();
			m.setViewName("ViewCustomers");
			try {
				m.addObject("ls", cobj.viewAllCustomers());
			} catch (Exception e) {
				System.out.println("Unable to view Customers.\t" + e);
				m.setViewName("aindex");
			}
			return m;
		}

	*/	
@RequestMapping(value = "/viewCustomers", method = RequestMethod.GET)
public ModelAndView viewuser() {
	ModelAndView m = new ModelAndView();
	m.setViewName("ViewCustomers");
	try {
		m.addObject("ls", cobj.findAll());
	} catch (Exception e) {
		System.out.println("Unable to view Customers.\t" + e);
		m.setViewName("aindex");
	}
	return m;
}
		@RequestMapping(value = "/updCu/{id}", method = RequestMethod.GET)
		public ModelAndView updPdCust(@PathVariable("id") int id) {
			m.setViewName("updateCustomer");
			// m.addObject("command", pobj.viewProductById(id));
			m.addObject("command", cobj.findById(id));
			System.out.println(cobj.findById(id));
			a = id;
			return m;
		}		
		
		@RequestMapping(value = "/updc", method = RequestMethod.GET)
		public ModelAndView uCust(@ModelAttribute("WatchStore") Customer c) {
			c.setId(a);
			cobj.saveOrUpdate(c);
			m.setViewName("redirect:/viewCustomers");
			return m;
		}
		
		@RequestMapping(value = "/delCu/{id}", method = RequestMethod.GET)
		public ModelAndView delCust(@PathVariable("id") int id) {
			cobj.delete(id);
			m.setViewName("redirect:/viewCustomers");
			return m;
		}
		
		
		
		
	/*
	 Product based controller 	
	 */

		@RequestMapping(value="/viewProducts",method=RequestMethod.GET)
		public ModelAndView showProd(){
			m.setViewName("viewProducts");
			m.addObject("ls", pobj.viewAllProducts());
			return m;
		}
		 
		@RequestMapping(value="/categories",method=RequestMethod.GET)
		public ModelAndView showCategories(){
			System.out.println("-----Categories Controller-----");
			m.addObject("ls", pobj.viewAllProducts());
			m.setViewName("categories");
			return m;
		}

		@ModelAttribute("prod")
		public Product getProduct(){
			return new Product();
		}

		
		@RequestMapping(value = "/showAddProd", method = RequestMethod.GET)
		public ModelAndView showAddProd1() {
			m.setViewName("addProducts");
			m.addObject("command", new Product());
			return m;
		}
		
		@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
		public ModelAndView addProd(@ModelAttribute("prod") @Valid Product prod, BindingResult result) {
			m.setViewName("fileupload");
			try {
				
				
			pobj.addProduct(prod);	
				//pd.addCategory(prod);
			} catch (Exception e) {
			}
			if (result.hasErrors())
				m.setViewName("addProducts");
			return m;
		}
		
		
		
		
		
		
		int a;
		@RequestMapping(value="/updPd/{id}",method = RequestMethod.GET)
		public ModelAndView updProd(@PathVariable("id")int id){
			m.setViewName("updateProduct");
			//m.addObject("command", pobj.viewProductById(id));
			m.addObject("command", pobj.viewProductById(id));
			System.out.println(pobj.viewProductById(id));a=id;
			return m;
		}
		
		@RequestMapping(value="/upd",method=RequestMethod.POST)
		public ModelAndView uPrd(@ModelAttribute("WatchStore")Product p){
			p.setPid(a);
			pobj.updateProduct(p);
			m.setViewName("redirect:/viewProducts");
			return m;
		}
		
		@RequestMapping(value="/delPd/{id}",method=RequestMethod.GET)
		public ModelAndView delProd(@PathVariable("id")int id){
			pobj.delProduct(id);
			m.setViewName("redirect:/viewProducts");
			return m;
		}
		

	
	 
	 
	 
	 
	 
	 
	 
	
}
