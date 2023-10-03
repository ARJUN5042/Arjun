package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.User;
import com.util.HBUtil;

public class RegisterDao 
{
	Session session=null;
	Transaction tx=null;
	User user=null;
	String msg="";
	public String doRegister(User user)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			
			msg="Registration is successfull...";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}
	
	public User getLogin(User user)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from User u where u.email=:email and u.password=:password");
			q.setParameter("email", user.getEmail());
			q.setParameter("password", user.getPassword());
			List<User> lists=q.list();
			user=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			user=null;
			e.printStackTrace();
		}
		return user;
	}
	
	public User verifyLogin(int id)
	{
		user=null;
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from User u where u.id=:id");
			q.setParameter("id", id);
			List<User> lists=q.list();
			user=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			user=null;
			e.printStackTrace();
		}
		return user;
	}
}
