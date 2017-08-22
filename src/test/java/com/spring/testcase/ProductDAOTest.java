package com.spring.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.dao.ProductDAO;
import com.spring.model.Product;

@ComponentScan("com.spring")
public class ProductDAOTest {
	
	
	@Autowired
	private static Product product;
	

	@Autowired
	private static ProductDAO productDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.spring.*");
		context.refresh();
		
		product=(Product) context.getBean("product");
		productDAO=(ProductDAO) context.getBean("productDAO");
	
	}
	
	@Test
	public void createProduct()
	{
		product.setName("javabook");
		product.setDescription("fiction");
		
		boolean flag=productDAO.saveProduct(product);
		
		assertEquals("createProductTestCase", true, flag);
		
		
	}
	
	
	
	
	
	

}
