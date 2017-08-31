package com.spring.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.dao.CategoryDAO;
import com.spring.dao.ProductDAO;
import com.spring.dao.SupplierDAO;
import com.spring.model.Product;

@Controller
//@RequestMapping(value="/admin")
public class ProductController {
	
	 static Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductDAO productDAO;

	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	SupplierDAO supplierDAO;
	
	
	

	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String getProductPage(@ModelAttribute("product") Product product,Model model)
	
	{
		model.addAttribute("categoryList", categoryDAO.list());
		model.addAttribute("supplierList", supplierDAO.list());
		model.addAttribute("productList", productDAO.list());
		model.addAttribute("ProductPageClicked", "true");
		return "AdminPage";
		
	}
	@RequestMapping(value="/saveProduct")
	public String updateproduct(@ModelAttribute("product") Product product,HttpServletRequest request,Model m,
			@RequestParam("file") MultipartFile file){
		
		String image=ImageController.uploadImage(file);
		if(!image.isEmpty())
		{
			product.setImage(image);
			
		}
			
			
			
			product.setInstock(true);
			  productDAO.saveProduct(product);
		
		
        return "redirect:/product";
	}
	
	
	@RequestMapping(value="editproduct/{id}",method=RequestMethod.GET)
	public String editProduct(@PathVariable("id") int id,RedirectAttributes attributes)
	{
		attributes.addFlashAttribute("product", this.productDAO.getProductById(id));
		return "redirect:/product";
	   }
	
	@RequestMapping(value="removeproduct/{id}",method=RequestMethod.GET)
	public String removeProduct(@PathVariable("id") int id,RedirectAttributes attributes)
	{
		productDAO.removeProducyById(id);
		attributes.addFlashAttribute("DeleteMessage", "Product has been deleted Successfully");
		return "redirect:/product";
	   }
	
	
}