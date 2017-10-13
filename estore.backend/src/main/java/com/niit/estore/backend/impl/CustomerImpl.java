package com.niit.estore.backend.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.estore.backend.dao.*;
import com.niit.estore.backend.model.Customer;


@Repository
public class CustomerImpl  implements CustomerDao{
@Autowired
private SessionFactory sessionFactory;
	public void save(Customer entity) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();		
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	public Set<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer findById(String email) {
		Session session=sessionFactory.openSession();
		String hql = "FROM Customer C WHERE C.email = '" + email +"'" ;
		Query query = session.createQuery(hql);
		List results = query.list();
		if(results!=null)
			return (Customer) results.get(0);
		
		else
			return null;		
		
	}
	public boolean validate(String email, String password) {
		Session session=sessionFactory.openSession();
		String hql = "FROM Customer C WHERE C.email = '" + email +"' AND C.password ='" + password + "'" ;
		Query query = session.createQuery(hql);
		List results = query.list();
		if(results!=null)
			return true;
		
		else
			return false;		
		
	}
	

}
