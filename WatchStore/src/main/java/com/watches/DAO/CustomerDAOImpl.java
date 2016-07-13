/**
 * 
 */
package com.watches.DAO;

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



@SuppressWarnings("unused")
@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sf;
	/* (non-Javadoc)
	 * @see com.shoes.DAO.CustomerDAO#addCustomer(com.shoes.model.Customer)
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		c.setEnabled(true);
		c.setRole("ROLE_USER");
		s.saveOrUpdate(c);
		t.commit();
	}


	/* (non-Javadoc)
	 * @see com.shoes.DAO.CustomerDAO#viewAllCustomers()
	 */
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public List<Customer> viewAllCustomers() {
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Customer> l= (List<Customer>)sf.getCurrentSession().createCriteria(Customer.class).list();
		t.commit();
		return l;
	}
	
	
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void save(Customer c) {
		
		   Session session=sf.getCurrentSession();
		   Transaction trans=(Transaction) session.beginTransaction();
		   c.setEnabled(true);
		   session.saveOrUpdate(c);
		   	trans.commit();
				
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(c);

	}
	@Transactional
	public void delCustomer(int id) {
		System.out.println(id);
		
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Object persistentInstance = s.get(Customer.class, id);
		if (persistentInstance != null) {
		    s.delete(persistentInstance);
		}
		t.commit();
	
	}


	


		
	
	
	
	
	
     
}
