package com.spring.dao;

import java.util.List;

import com.spring.model.Category;

public interface CategoryDAO {

	public boolean saveCategory(Category category);
	
	public List<Category> list();
	
}
