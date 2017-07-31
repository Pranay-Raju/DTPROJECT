package com.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.CategoryDAO;
import com.spring.dao.ProductDAO;
import com.spring.dao.SupplierDAO;

@Controller
public class HomeController {


	@Autowired
	ProductDAO productDAO;

	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	SupplierDAO supplierDAO;
	
	
	@RequestMapping("/")
	public ModelAndView dynamicNav(HttpSession session) {
		ModelAndView mv = new ModelAndView("index");
		session.setAttribute("categoryList", categoryDAO.list());
	
		return mv;
	}

	
	
	
	
	}
	
	
	
