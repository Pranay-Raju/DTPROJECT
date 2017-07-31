/**
 * 
 */
package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Transactional
	public boolean saveProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Transactional
	public List<Product> list() {
	List<Product>product=	sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		return product;
	}

}
