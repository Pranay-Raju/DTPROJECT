package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.CategoryDAO;
import com.spring.model.Category;
import com.spring.model.Supplier;

@Controller
public class CategoryController {

	
	@Autowired
	CategoryDAO categoryDAO;
	

	@RequestMapping(value="category",method=RequestMethod.GET)
	public String getSupplierPage(@ModelAttribute("category") Category category,Model model)
	{
		model.addAttribute("categoryList",categoryDAO.list());
		model.addAttribute("CategoryPageClicked", "true");
		return "index";
		
	}
	
	
	
	@RequestMapping(value="saveCategory",method=RequestMethod.POST)
	public String insertSupplier(@ModelAttribute("category") Category category,Model model)
	{
		if(categoryDAO.saveCategory(category)==true)
		{
		model.addAttribute("message", "Supplier Object has been added successfully");
		}
		else
		{
			
		}
		return "redirect:/category";
	   }
	
}
