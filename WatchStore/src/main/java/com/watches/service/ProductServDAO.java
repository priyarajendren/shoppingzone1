package com.watches.service;

import java.util.List;

import com.watches.model.Product;

public interface ProductServDAO {

	public void addProduct(Product p);
	public List<Product> viewAllProducts();
	public void delProduct(int id);
	public void updateProduct(Product p);
	public Product viewProductById(int id);
}
