package com.watches.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.watches.model.Customer;
import com.watches.model.Product;
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sf;
	/* (non-Javadoc)
	 * @see com.shoes.DAO.ProductDAO#addProduct(com.shoes.model.Product)
	 */
	@Transactional
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(p);
		t.commit();
	}

	/* (non-Javadoc)
	 * @see com.shoes.DAO.ProductDAO#viewAllProducts()
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Product> l1 = s.createCriteria(Product.class).list();
		t.commit();
		return l1;
	}

	@Transactional
	public void delProduct(int id) {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Object persistentInstance = s.load(Product.class, id);
		if (persistentInstance != null) {
		    s.delete(persistentInstance);
		}
		t.commit();
	}

	@Transactional
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Object persistentInstance = s.load(Product.class, p.getPid());
		if (persistentInstance != null) {
		    s.update(p);
		}
		t.commit();
	}

	@Transactional
	public Product viewProductById(int id) {
		// TODO Auto-generated method stub
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Product persistentInstance = (Product)s.load(Product.class, id);
		t.commit();
		if (persistentInstance != null) {
		    return persistentInstance;
		}
		return null;
	}


}
