package com.watches.dao;

import java.util.List;

import com.watches.model.Product;

public interface ProductDAO {

	public void addProduct(Product p);
	public List<Product> viewAllProducts();
	public Product viewProductById(int id);
	public void delProduct(int id);
	public void updateProduct(Product p);
	
}
