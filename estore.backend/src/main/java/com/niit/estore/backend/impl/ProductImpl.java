package com.niit.estore.backend.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.estore.backend.dao.ProductDao;
import com.niit.estore.backend.model.Product;

@Repository
public class ProductImpl implements ProductDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void save(Product entity) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(findById(id));
		session.getTransaction().commit();
		session.close();
	}

	public void update(Product entity) {
		// TODO Auto-generated method stub
		
	}

	public Product findById(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.eq("id", new Integer(id)));
		List list=criteria.list();
		session.getTransaction().commit();
		session.close();
		if(!list.isEmpty()){
			return (Product)list.get(0);
		}else{
			return null;
		}
		
	}

	public boolean validate(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Product> findAll() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Product.class);
		List<Product> products=criteria.list();
		return products;
	}

}
