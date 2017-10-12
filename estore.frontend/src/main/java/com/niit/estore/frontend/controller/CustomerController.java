package com.niit.estore.frontend.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.estore.backend.dao.CustomerDao;
import com.niit.estore.backend.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDao customerDao;
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register(){
		//ModelAndView mv=new ModelAndView("register");
		ModelAndView mv=new ModelAndView("register","command",new Customer());
		return mv;
	}
	
	/*@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("sucess");
		String name=request.getParameter("txtName");
		String email=request.getParameter("txtEmail");
		String contact=request.getParameter("txtContact");
		String address=request.getParameter("txtAddress");
		Customer customer=new Customer();
		customer.setName(name);
		customer.setEmail(email);
		customer.setContact(contact);
		customer.setAddress(address);
		customerDao.save(customer);
		return mv;
	}	*/
	@RequestMapping(value="/register", method=RequestMethod.POST)
	 public ModelAndView register(@ModelAttribute("customer") Customer customer){
		ModelAndView mv=new ModelAndView("sucess");
		customerDao.save(customer);
		return mv;
	 }
	
}
