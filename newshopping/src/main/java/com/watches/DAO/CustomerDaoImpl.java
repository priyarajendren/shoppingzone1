package com.watches.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.watches.model.Customer;

@Repository("CustomerDao")
public class CustomerDaoImpl implements CustomerDao {
	

	@Autowired
	private SessionFactory sessionFactory;


	public CustomerDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Customer> list() {
		@SuppressWarnings("unchecked")
		List<Customer> listCustomer = (List<Customer>) sessionFactory.getCurrentSession()
				.createCriteria(Customer.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCustomer;
	}

	@Transactional
	public void saveOrUpdate(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Transactional
	public void delete(int id) {
		Customer CustomerToDelete = new Customer();
		CustomerToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(CustomerToDelete);
	}

	@Transactional
	public Customer get(String id) {
		String hql = "from Customer where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Customer> listCustomer = (List<Customer>) query.list();
		
		if (listCustomer != null && !listCustomer.isEmpty()) {
			return listCustomer.get(0);
		}
		
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}
