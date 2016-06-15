package com.watches.dao;

import java.util.List;

import com.watches.model.Product;

public interface ProductDao {
	public List<Product> getAllDetails();
	public void addProduct	(Product p);
	public Product deleteProduct(int id);
	public void updateProduct(Product p);
	
	

}
