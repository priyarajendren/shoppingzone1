package com.watches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.watches.DAO.ProductDao;
import com.watches.model.Product;



@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;
	

	@RequestMapping("/addProduct")
	public ModelAndView addProduct(@ModelAttribute Product product) {
		productDao.saveOrUpdate(product);
	  return new ModelAndView("/adminHome");
	 }
	
	
	
	@RequestMapping("/getAllProducts")
	public ModelAndView getAllProducts() {

		System.out.println("getAllProducts");
		
		List<Product> List = productDao.list();
		
		ModelAndView mv = new ModelAndView("/productList");
		mv.addObject("productList", List);

		return mv;
	}
	
	

}
