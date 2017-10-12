package com.niit.estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.estore.backend.dao.CustomerDao;
import com.niit.estore.backend.model.Customer;

@Controller
public class IndexController {
	@Autowired
	private CustomerDao customerDao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("index");
/*		Customer customer=new Customer();
		customer.setName("Mukil");
		customer.setEmail("mukil@example.com");
		customer.setAddress("Madurai");
		customer.setContact("9876543210");
		customerDao.save(customer)*/;		
		return mv;
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	/*
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView index(){
	
	}
	*/
}
