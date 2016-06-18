package com.watches.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.watches.bean.Product;

@Repository
public class ProductDao {
	@SuppressWarnings("unused")
	@Autowired
	private Product product;
	
	
	public List<Product> getAllDetails()
	{
	List<Product> list = new ArrayList<Product>();		
		
		Product p=new Product(0, null, 0);
		p.setProdId(210);
		p.setProdName("priya");
		p.setProdPrice(1234);
		list.add(p);
		

		p=new Product(0, null, 0);
		p.setProdId(211);
		p.setProdName("neeraja");
		p.setProdPrice(1244);
		list.add(p);
		
		
		p=new Product(0, null, 0);
		p.setProdId(213);
		p.setProdName("karthick");
		p.setProdPrice(1245);
		list.add(p);
	return list;	
		
		
		
	}
	public int updateCategories(List<Product>  productList)
	{
		
		
		return 1;
	}
	
	
	

}
