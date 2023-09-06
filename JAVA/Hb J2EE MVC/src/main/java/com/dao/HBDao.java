package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UserModel;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	String msg="";
	public String doRegister(UserModel rmodel)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(rmodel);
			tx.commit();
			session.close();
			
			msg="Registration is Successfull....";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}
	UserModel model=null;
	public UserModel getLogin(UserModel lmodel)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from UserModel u where u.username=:username and u.password=:password");
			q.setParameter("username", lmodel.getUsername());
			q.setParameter("password", lmodel.getPassword());			
			List<UserModel> lists=q.list();
			model=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			model=null;
			e.printStackTrace();
		}
		return model;
	}
	public UserModel verifyLogin(int uid)
	{
		model=null;
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from UserModel u where u.uid=:uid");
			q.setParameter("uid", uid);
			List<UserModel> lists=q.list();
			model=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			model=null;
			e.printStackTrace();
		}
		return model;
	}
	int x=0;
	public int updateUser(UserModel homemodel)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("update UserModel u set u.firstname=?0,u.lastname=?1,u.username=?2,u.password=?3 where u.uid=?4");
			q.setString(0, homemodel.getFirstname());
			q.setString(1, homemodel.getLastname());
			q.setString(2, homemodel.getUsername());
			q.setString(3, homemodel.getPassword());
			q.setInteger(4, homemodel.getUid());
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
	public int deleteUser(int uid)
	{
		x=0;
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("delete from UserModel u where u.uid=?0");
			q.setInteger(0, uid);
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
