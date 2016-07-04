package com.watches.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.watches.dao.ProductDAO;
import com.watches.model.Product;
@Service("productService")
public class ProductService implements ProductServDAO{

	@Autowired
	ProductDAO pd;
	/* (non-Javadoc)
	 * @see com.shoes.service.ProductServDAO#addProduct(com.shoes.model.Product)
	 */
	@Transactional
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		pd.addProduct(p);
	}

	/* (non-Javadoc)
	 * @see com.shoes.service.ProductServDAO#viewAllProducts()
	 */
	@Transactional
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return pd.viewAllProducts();
	}

	@Transactional
	public void delProduct(int id) {
		// TODO Auto-generated method stub
		pd.delProduct(id);
	}

	@Transactional
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		pd.updateProduct(p);
	}
	@Transactional
	public Product viewProductById(int id) {
		// TODO Auto-generated method stub
		return pd.viewProductById(id);
	}

}
