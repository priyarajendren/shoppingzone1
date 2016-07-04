package com.watches.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.watches.model.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sf;
	/* (non-Javadoc)
	 * @see com.shoes.DAO.CustomerDAO#addCustomer(com.shoes.model.Customer)
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(c);
		t.commit();
	}


	/* (non-Javadoc)
	 * @see com.shoes.DAO.CustomerDAO#viewAllCustomers()
	 */
	@SuppressWarnings("unchecked")
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Customer> l= (List<Customer>)sf.getCurrentSession().createCriteria(Customer.class).list();
		t.commit();
		return l;
	}

	public void delCustomer(int id) {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Object persistentInstance = s.load(Customer.class, id);
		if (persistentInstance != null) {
		    s.delete(persistentInstance);
		}
		t.commit();
	}

	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		Session s =sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Customer persistentInstance = (Customer)s.load(Customer.class, c.getId());
		if (persistentInstance != null) {
		    persistentInstance.setName(c.getName());
		    persistentInstance.setAddr(c.getAddr());
		    persistentInstance.setEmail(c.getEmail());
		    persistentInstance.setPhno(c.getPhno());
		    persistentInstance.setPwd(c.getPwd());
		    s.update(persistentInstance);
		}
		t.commit();
	}

	
}
