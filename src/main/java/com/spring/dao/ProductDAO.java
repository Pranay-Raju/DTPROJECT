package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDAO {
	
	public boolean saveProduct(Product product);
	
	public List<Product> list();

}
