package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.User;
import com.util.HBUtil;

public class RegisterDao 
{
	Session session=null;
	Transaction tx=null;
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
}
