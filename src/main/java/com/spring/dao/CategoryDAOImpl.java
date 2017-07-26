package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean saveCategory(Category category) {
		
		 sessionFactory.getCurrentSession().saveOrUpdate(category);
		/*Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(category);
		Transaction tx=session.beginTransaction();
		tx.commit();
		*/
		
		
		
		 return true;
	}

	public List<Category> list() {
		Query qry =sessionFactory.getCurrentSession().createQuery("from category");
		List l = qry.list();
		return l;
	}

}
