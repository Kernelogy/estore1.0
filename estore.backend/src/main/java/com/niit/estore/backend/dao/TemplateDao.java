package com.niit.estore.backend.dao;

import java.util.List;


public interface TemplateDao<T> {
	public void save(T entity);
	public void delete(int id);
	public void update(T entity);
	public T findById(int id);
	public boolean validate(String email, String password);
	public List<T> findAll();
}
