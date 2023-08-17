package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.model.ProfileDetails;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	public void addEmployee(Employee e)
	{
		session = new HBUtil().getSessionData();
		tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		System.out.println("Employee data added successfully....");
	}
	public void addProfileDetails(ProfileDetails p)
	{
		session = new HBUtil().getSessionData();
		tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		System.out.println("Profile Details added successfully....");
	}
}
