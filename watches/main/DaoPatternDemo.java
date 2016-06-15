package com.watches.main;

import com.watches.dao.CustomerDao;
import com.watches.dao.CustomerDaoImpl;
import com.watches.dao.ProductDao;
import com.watches.dao.ProductDaoImpl;
import com.watches.model.Customer;
import com.watches.model.Product;

public class DaoPatternDemo {
  public static void main(String[] args) {
	  CustomerDao customerDao=new CustomerDaoImpl();
	  ProductDao productDao=new ProductDaoImpl();
	  
	  for(Customer customer : customerDao.getAllDetails()) {
		  System.out.println("customer first name:"+ customer.getFirstName()+" ,last name :"+ customer.getLastName()+", userid:"+ customer.getUserId()+",password:"+ customer.getPassword());
	  }
	  for(Product product : productDao.getAllDetails()){
		  System.out.println("product id:" + product.getProdId()+",product name:"+ product.getProdName()+",productprice:"+ product.getProdPrice());
	  }
	  //update customer and product
	  Customer customer=customerDao.getAllDetails().get(0);
	  customer.setFirstName("varun");
	  customer.setLastName("kannan");
	  customer.setUserId(301);
	  customer.setPassword("vijay");
	  Product product=productDao.getAllDetails().get(0);
	  product.setProdId(502);
	  product.setProdName("vijay");
	  product.setProdPrice(120000);
	  //get the customer and product
	 customerDao.getAllDetails();
	 System.out.println("customer first name:"+ customer.getFirstName()+" ,last name :"+ customer.getLastName()+", userid:"+ customer.getUserId()+",password:"+ customer.getPassword());
	 productDao.getAllDetails();
	 System.out.println("product id:" + product.getProdId()+",product name:"+ product.getProdName()+",productprice:"+ product.getProdPrice());
	 
  // Deleting the product
	 
	 Product prod = productDao.deleteProduct(502);
	 
	 
	
	 
  }
}
 

