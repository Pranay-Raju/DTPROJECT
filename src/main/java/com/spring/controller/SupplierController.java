package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.SupplierDAO;
import com.spring.model.Supplier;
@Controller
public class SupplierController {

	
	
	@Autowired
	SupplierDAO supplierDAO;
	
	
	
	@RequestMapping(value="supplier",method=RequestMethod.GET)
	public String getSupplierPage(@ModelAttribute("supplier") Supplier supplier,Model model)
	{
		model.addAttribute("supplierList",supplierDAO.list());
		model.addAttribute("SupplierPageClicked", "true");
		return "index";
		
	}
	
	
	
	@RequestMapping(value="saveSupplier",method=RequestMethod.POST)
	public String insertSupplier(@ModelAttribute("supplier") Supplier supplier,Model model)
	{
		if(supplierDAO.saveSupplier(supplier)==true)
		{
		model.addAttribute("message", "Supplier Object has been added successfully");
		}
		else
		{
			
		}
		return "redirect:/";
	   }
	
}
