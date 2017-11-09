package com.niit.estore.frontend.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("index");
		Principal principal=request.getUserPrincipal();
		Customer customer=null;
		if(principal!=null){
			customer=customerDao.findById(principal.getName());
		}
		mv.getModelMap().addAttribute("customer", customer);
/*		Customer customer=new Customer();
		customer.setName("Mukil");
		customer.setEmail("mukil@example.com");
		customer.setAddress("Madurai");
		customer.setContact("9876543210");
		customerDao.save(customer)*/;		
		return mv;
	}
	@RequestMapping(value="/accessDenied", method=RequestMethod.GET)
	public ModelAndView accessDenied(){
		ModelAndView mv=new ModelAndView("accessDenied");
		return mv;
	}


	
	
	/*
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView index(){
	
	}
	*/
}
