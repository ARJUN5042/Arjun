package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Reader;
import com.model.Subscription;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	String msg="";
	String msg1="";
	
	public String doInsert(Reader reader)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(reader);
			tx.commit();
			session.close();
			
			msg="Data Insert is Successfull....";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}
	public String doInsert(Subscription subscription)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(subscription);
			tx.commit();
			session.close();
			
			msg1="Subscription is Successfull....";
		}
		catch(Exception e)
		{
			msg1="error";
			e.printStackTrace();
		}
		return msg1;
	}
}
