package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
