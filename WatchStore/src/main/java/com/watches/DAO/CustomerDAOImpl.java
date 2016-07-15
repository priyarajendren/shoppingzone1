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

import com.watches.DAO.CustomerDAO;
import com.watches.model.Customer;
import com.watches.model.Product;

@Repository("custDao")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sf;

	@SuppressWarnings("unchecked")

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public List<Customer> getItems() {		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		return (List<Customer>) sf.getCurrentSession().createCriteria(Customer.class).list();
	}


	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public Customer findById(Integer id) {
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Customer persistentInstance = (Customer)s.load(Customer.class, id);
		t.commit();
		if (persistentInstance != null) {
		    return persistentInstance;
		}
		return null;
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
	public void update(Customer c) {
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Object persistentInstance = s.load(Customer.class, c.getId());
		if (persistentInstance != null) {
		    s.update(c);
		}
		t.commit();
	}
	public void delete(int id) {
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

