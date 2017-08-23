package com.spring.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.ProductDAO;
import com.spring.model.Product;

import java.io.IOException;

import javax.servlet.ServletException;


@Controller
//@RequestMapping("/myImage")
public class ImageController {
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
	  public void showImage(@RequestParam("id") int id, HttpServletResponse response,HttpServletRequest request) 
			  throws ServletException, IOException{
		
		System.out.println(id);
		Product p=productDAO.getProductById(id);
		System.out.println(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		
		//String yourBase64EncodedBytesString = new String(Base64.encodeBase64(content));
		//System.out.println(new String(item.getItemImage()));
		
		response.getOutputStream().write(p.getImage());
		
		System.out.println("Image is");
	
		response.getOutputStream().close();
		/*
		byte[] encoded=Base64.encodeBase64(item.getItemImage());
		String encodedString = new String(encoded);
		request.setAttribute("image", encodedString);
		ModelMap map = new ModelMap();
		map.put("image", encodedString);
		*/
	
	}
	

}