package com.niit.estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.estore.backend.dao.CustomerDao;

@Controller
public class Customer {
	@Autowired
	private CustomerDao CustomerDao;
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(){
		ModelAndView mv=new ModelAndView("register");
		return mv;
	}
}
