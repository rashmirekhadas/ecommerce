package com.niit.MyfirstprojectBackend.test;



import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.MyfirstprojectBackend.dao.UserDAO;
import com.niit.MyfirstprojectBackend.model.User;

public class UserTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyfirstprojectBackend");
		context.refresh();	
		userDAO = (UserDAO)context.getBean("userDAO");
	}
	
	@Test
public void testAddUser() {
		
		user = new User();
	
		user.setFirstName("dillip");
		user.setLastName("dora");
		user.setEmail("dillip@gmail.com");
		user.setContactNumber("24937284");
	    user.setPassword("dillip");
	    
	 // add the user
	 		assertEquals("Failed to add the user!",true,userDAO.add(user));	
		

}}
