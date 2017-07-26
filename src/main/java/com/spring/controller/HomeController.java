package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.CategoryDAO;
import com.spring.dao.SupplierDAO;
import com.spring.model.Category;
import com.spring.model.Supplier;

@Controller
public class HomeController {

	
	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getIndexPage()
	{
		return "index";
		
	}
	@RequestMapping(value="category",method=RequestMethod.GET)
	public String getCategoryPage(@ModelAttribute("category") Category category)
	{
		return "CategoryPage";
		
	}
	
	
	
	@RequestMapping(value="saveCategory",method=RequestMethod.POST)
	public String insertCategory(@ModelAttribute("category") Category category)
	{
		categoryDAO.saveCategory(category);
		return "redirect:/";
	   }
	
	/*
	=============================*/
	@RequestMapping(value="supplier",method=RequestMethod.GET)
	public String getSupplierPage(@ModelAttribute("supplier") Supplier supplier)
	{
		return "SupplierPage";
		
	}
	
	
	
	@RequestMapping(value="saveSupplier",method=RequestMethod.POST)
	public String insertSupplier(@ModelAttribute("supplier") Supplier supplier)
	{
		supplierDAO.saveSupplier(supplier);
		return "redirect:/";
	   }
	
	
	
	
	
	}
	
	
	
