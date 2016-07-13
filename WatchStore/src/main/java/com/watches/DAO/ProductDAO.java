package com.watches.DAO;

import com.watches.model.Product;
import java.util.List;

public interface ProductDAO {

	public void addProduct(Product p);
	public List<Product> viewAllProducts();
	public Product viewProductById(int id);
	public void delProduct(int id);
	public void updateProduct(Product p);
}
