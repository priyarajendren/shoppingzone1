package com.watch.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.validation.Valid;

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

@Controller
public class watchController {

	ModelAndView m = new ModelAndView();
	
	@Autowired
	CustomerServDAO cobj;
	@Autowired
	ProductServDAO pobj;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(){
		System.out.println("-----Home Controller-----");
		m.setViewName("index");
		return m;
	}
		
	@RequestMapping("/login")
	public ModelAndView culog(){
		m.setViewName("login");
		return m;
	}
	
	@RequestMapping("/brands")
	public ModelAndView brands(){
		m.setViewName("brands");
		return m;
	
	}
	
	@RequestMapping("/aboutus")
	public ModelAndView aboutus(){
		m.setViewName("aboutus");
		return m;
	
	}
	
	
	

	@RequestMapping("/allProducts")
	public ModelAndView allProducts(){
		m.setViewName("allProducts");
		return m;
	
	}
	
	
	
	
	
	@ModelAttribute("cust")
	public Customer getCust(){
		return new Customer();
	}
	
	@RequestMapping(value="/signUp",method=RequestMethod.GET)
	public ModelAndView signUp(){
		System.out.println("-----Signup Controller-----");
		m.setViewName("signUp");
		//m.addObject("command", new Customer());
		return m;
	}
	
	@RequestMapping(value="/logup", method=RequestMethod.POST)
	public String addCustomerdetails(@ModelAttribute("cust")@Valid Customer cust,BindingResult result){
		//m.setViewName("cindex");
		try{
		cobj.addCustomer(cust);
		}
		catch(Exception e){}
		if(result.hasErrors()){
			//m.setViewName("signup");
			//m.addObject("command", result.getModel());
			//m.addObject("BindingResult",result);
			return "signUp";
		}
		return "cindex";
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
	
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public ModelAndView allCategories(){
		System.out.println("-----Categories Controller-----");
		m.addObject("ls", pobj.viewAllProducts());
		m.setViewName("categories");
		return m;
	}
	
	@RequestMapping(value="/showAddCust",method=RequestMethod.GET)
	public ModelAndView showAddCust(){
		m.setViewName("signUp");
		m.addObject("command", new Customer());
		return m;
	}
	
	@RequestMapping(value="/ViewCustomers",method=RequestMethod.GET)
	public ModelAndView viewuser(){
		m.setViewName("ViewCustomers");
		try{
		m.addObject("ls", cobj.viewAllCustomers());
		}
		catch(Exception e){
			System.out.println("Unable to view Customers.\t"+e);
			m.setViewName("aindex");
		}
		return m;
	}
	
	@RequestMapping(value="/showAddProd",method=RequestMethod.GET)
	public ModelAndView showAddProd(){
		m.setViewName("addProd");
		m.addObject("command", new Product());
		return m;
	}
	
	@RequestMapping(value="/addProd",method=RequestMethod.POST)
	public ModelAndView addProd(@ModelAttribute("newshoppingcart")@Valid Product prod,BindingResult result){
		m.setViewName("fileupload");
		try{
			pobj.addProduct(prod);
		}
		catch(Exception e){}
		if(result.hasErrors())
			m.setViewName("showAddProd");
		return m;
	}
	
	/*@RequestMapping("/uploadFile")
	public ModelAndView fileup(@RequestParam("name")String name,@RequestParam("file")MultipartFile file){
		if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
 
                // Creating the directory to store file
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();
 
                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();            
                System.out.println("You successfully uploaded file=" + rootPath+" "+name);
                m.setViewName("aindex");
            } catch (Exception e) {
                System.out.println("You failed to upload " + name + " => " + e.getMessage());
            }
        } 
		else {
			m.setViewName("uploadFile");
            System.out.println("You failed to upload " + name + " because the file was empty.");
        }
		return m;
	}*/
	
	@RequestMapping(value="/viewProducts",method=RequestMethod.GET)
	public ModelAndView showProd(){
		m.setViewName("viewProducts");
		m.addObject("ls", pobj.viewAllProducts());
		return m;
	}
	
	
	@RequestMapping(value="/ViewCustomers",method=RequestMethod.GET)
	public ModelAndView ViewCustomers(){
		m.setViewName("ViewCustomers");
		m.addObject("ls", cobj.viewAllCustomers());
		return m;
	}
	
	
	
	
	
	
	@RequestMapping(value="/updPd/{id}",method=RequestMethod.GET)
	public ModelAndView updProd(@PathVariable("id")int id){
		m.setViewName("updateProduct");
		//m.addObject("command", pobj.viewProductById(id));
		m.addObject("command", pobj.viewProductById(id));
		System.out.println(pobj.viewProductById(id));a=id;
		return m;
	}
	
	@RequestMapping(value="/upd",method=RequestMethod.POST)
	public ModelAndView uProd(@ModelAttribute("newshoppingcart")Product p){
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
	
	@RequestMapping(value="/addcart/{id}")
	public String doaddcart(@RequestParam("id")int id){
		System.out.println("p = "+pobj.viewProductById(id));
		return "confirm";
	}
	
	@RequestMapping("/confirm")
	public String doconfirm(){
		System.out.println("confirmed");
		return "proddelivery";
	}
	
	int a;
	
	@RequestMapping(value="/aboutus",method=RequestMethod.GET)
	public ModelAndView about(){
		System.out.println("-----AboutUs Controller-----");
		m.setViewName("aboutus");
		return m;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView lgot(){
		System.out.println("-----Log Controller-----");
		m.setViewName("logout");
		return m;
	}
	
	@RequestMapping(value="/accessdenied",method=RequestMethod.GET)
	public ModelAndView gohome1(){
		System.out.println("-----Access Controller-----");
		m.setViewName("accessdenied");
		return m;
	}
}
