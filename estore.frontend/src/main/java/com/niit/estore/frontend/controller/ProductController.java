package com.niit.estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.estore.backend.dao.ProductDao;
import com.niit.estore.backend.model.Product;

@Controller
@RequestMapping(value="/product")
public class ProductController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("product","command", new Product());
		mv.getModelMap().addAttribute("products", productDao.findAll());
		return mv;
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ModelAndView delete(@RequestParam("id") int id){
		ModelAndView mv=new ModelAndView("product","command", new Product());
		productDao.delete(id);
		mv.getModelMap().addAttribute("products", productDao.findAll());
		return mv;
	}	
}
