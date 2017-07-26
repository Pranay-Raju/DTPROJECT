package com.spring.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public boolean saveSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		
		return true;
	}

}
