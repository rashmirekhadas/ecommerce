package com.niit.MyfirstprojectBackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.MyfirstprojectBackend.dao.UserDAO;
import com.niit.MyfirstprojectBackend.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(User user) {
		try {			
			sessionFactory.getCurrentSession().persist(user);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
	

}
