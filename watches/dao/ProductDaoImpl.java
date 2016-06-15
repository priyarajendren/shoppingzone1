package com.watches.dao;

import java.util.ArrayList;
import java.util.List;

import com.watches.model.Product;




	public class ProductDaoImpl implements ProductDao {
		List<Product> products;
		public ProductDaoImpl() {
			products = new ArrayList<Product>();
			Product product1=new Product(210,"priya",1234);
			Product product2=new Product(211,"priyav",1233);
			products.add(product1);
			products.add(product2);
		}
		@Override
		public List<Product> getAllDetails() {
			
			return products;
		}
		@Override
		public void addProduct(Product p) {
			p.setProdId(210);
			p.setProdName("priya");
			p.setProdPrice(1234);
			
		}
		
		@Override
		public void updateProduct(Product p) {
			products.get(211).setProdId(213);
			System.out.println("product: prodid" + products.get(213) );
			
		}
		@Override
		public Product deleteProduct(int id) {
			Product p = null;
			// TODO Auto-generated method stub
			return p;
		}
	}
		


