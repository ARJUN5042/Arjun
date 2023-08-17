package com.dao;

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
}
