package com.niit.estore.frontend.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.estore.backend.dao.CustomerDao;
import com.niit.estore.backend.model.Address;
import com.niit.estore.backend.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDao customerDao;
/*	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register(){
		//ModelAndView mv=new ModelAndView("register");
		ModelAndView mv=new ModelAndView("register","command",new Customer());
		return mv;
	}*/
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("sucess");
/*		String name=request.getParameter("txtName");
		String email=request.getParameter("txtEmail");
		String contact=request.getParameter("txtContact");
		String address=request.getParameter("txtAddress");
		Customer customer=new Customer();
		customer.setName(name);
		customer.setEmail(email);
		customer.setContact(contact);
		customer.setAddress(address);*/
		Customer customer=new Customer();
		customer.setName("admin");
		customer.setEmail("admin@example.com");
		customer.setPassword("admin");
		customer.setContact("876543210");
		Address address=new Address();
		address.setCity("Madurai");
		address.setState("TN");
		address.setPincode(625016);
		customer.setAddress(address);
		customerDao.save(customer);
		return mv;
	}	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	 public ModelAndView register(@ModelAttribute("customer") Customer customer){
		ModelAndView mv=new ModelAndView("sucess");
		customerDao.save(customer);
		return mv;
	 }
	
/*	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response){		
		String email=request.getParameter("txtEmail");
		String password=request.getParameter("txtPassword");
		Customer customer=customerDao.findById(request.getParameter("txtEmail"));	
		//request.setAttribute("customer", customer );
		ModelAndView mv=null;
		if(email.equals(customer.getEmail()) && password.equals(customer.getPassword())){
			mv=new ModelAndView("sucess");
			mv.getModelMap().addAttribute("customer", customer);
		}else{
			mv=new ModelAndView("failure");		
			mv.getModelMap().addAttribute("customer", customer);
		}			
		return mv;
	}*/
	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response){
		String email=request.getParameter("txtEmail");
		String password=request.getParameter("txtPassword");		
		ModelAndView mv=null;
		if(customerDao.validate(email, password)){
			HttpSession session=request.getSession(true);
			session.setAttribute("email", email);
			mv=new ModelAndView("redirect: ./");
			//mv.getModelMap().addAttribute("customer", customer);
		}else{
			mv=new ModelAndView("failure");		
			//mv.getModelMap().addAttribute("customer", customer);
		}			
		return mv;
	
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
		HttpSession session=request.getSession(false);
		if(session!=null)
			session.invalidate();
		ModelAndView mv=new ModelAndView("redirect: ./");
		return mv;
	}
	
}
