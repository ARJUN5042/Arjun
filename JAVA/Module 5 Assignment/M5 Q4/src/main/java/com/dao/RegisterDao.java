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
	int x=0;
	public int updateUser(User user)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("update User u set u.firstname=?0,u.lastname=?1,u.email=?2,u.mobile=?3,u.password=?4,u.gender=?5,u.image=?6 where u.id=?7");
			q.setString(0, user.getFirstname());
			q.setString(1, user.getLastname());
			q.setString(2, user.getEmail());
			q.setString(3, user.getMobile());
			q.setString(4, user.getPassword());
			q.setString(5, user.getGender());
			q.setString(6, user.getImage());
			q.setInteger(7, user.getId());
			x=q.executeUpdate();
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int deleteUser(int id)
	{
		x=0;
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("delete from User u where u.id=?0");
			q.setInteger(0, id);
			x=q.executeUpdate();
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
}
