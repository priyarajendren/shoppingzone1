
package com.watches.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.watches.DAO.ProductDAO;
import com.watches.model.Product;


@Service("productService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductService implements ProductServDAO {

	@Autowired
	ProductDAO pd;
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addProduct(Product p) {
		pd.addProduct(p);
	}

	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public List<Product> viewAllProducts() {
		return pd.viewAllProducts();
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void delProduct(int id) {
		pd.delProduct(id);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateProduct(Product p) {
		pd.updateProduct(p);
	}

	
	/*
	@Transactional
	public Product viewProductById(int id) {
		
		return pd.viewProductById(id);
	}
*/
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public Product viewProductById(int id) {
		// TODO Auto-generated method stub
		return pd.viewProductById(id);
	}

	
	
}
