package com.spring.testcase;


import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.dao.SupplierDAO;
import com.spring.model.Supplier;


@ComponentScan("com.spring.model")
public class SupplierDAOTest {

	
	@Autowired
	private static Supplier supplier;

	@Autowired
	private static SupplierDAO supplierDAO;
	
	
	
	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.*");
		context.refresh();
		
			supplier = (Supplier) context.getBean("supplier");
			supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}

	@Test
	public void createSupplierTestCase()
	{
		supplier.setSupplierName("Sam");
		supplier.setSupplierAddress("KPHB");
		boolean flag = supplierDAO.saveSupplier(supplier);
		assertEquals("createSupplierTestCase", true, flag);
	}

	@Test
	public void updateProductTestCase()
	{
		supplier.setId(391);
		supplier.setSupplierName("Ramesh");
		
		boolean flag = supplierDAO.saveSupplier(supplier);
		assertEquals("updateSupplierTestCase", true, flag);
	}
	@Test
	public void deleteSupplierTestCase()
	{
	supplier.setId(394);
		Supplier flag=supplierDAO.removeSupplierById(394);
		assertEquals("deleteSupplierTestCase", false, flag);
	}
	

	@Test
	public void getAllSupplierTestCase()
	{
		int noofpro=supplierDAO.list().size();
		assertEquals("getAllSupplierTestCase", noofpro);
	}
	}

