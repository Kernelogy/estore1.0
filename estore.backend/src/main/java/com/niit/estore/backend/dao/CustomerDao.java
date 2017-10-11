package com.niit.estore.backend.dao;

import java.util.Set;
import com.niit.estore.backend.model.Customer;

public interface CustomerDao {
	public void save(Customer entity);
	public void delete(int id);
	public void update(Customer entity);
	public Customer findById(int id);
	public Set<Customer> findAll();
}
