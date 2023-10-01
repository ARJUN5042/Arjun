package com.service;

import com.dao.UserDao;
import com.model.User;

public class UserService 
{
	private UserDao userDao;

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public boolean createUser(User user)
	{
		
		return userDao.createUser(user);
	}
	
	public User authenticateUser(String email,String password)
	{
		
		User user=userDao.getUserByEmail(email);
		if(user!=null && user.getPassword().equals(password))
		{
			return user;
		}
		return null;
	}
	
	public User getUserByEmail(String email)
	{
		
		return userDao.getUserByEmail(email);
	}
	
	public boolean updateUser(User user)
	{
		return userDao.updateUser(user);
	}
	
	public boolean isEmailRegistered(String email)
	{
		return userDao.isEmailRegistered(email);
	}
}
