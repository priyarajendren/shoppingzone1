package com.watches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.watches.bean.Product;
import com.watches.dao.ProductDao;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao productDaO;

	@RequestMapping("/getAllDeatils")
	public ModelAndView getAllDetails() {

		System.out.println("getAllDetails");
		
		List<Product> productList = productDaO.getAllDetails();
		
		ModelAndView mv = new ModelAndView("/productList");
		mv.addObject("productList", productList);

		return mv;
	}
}	


