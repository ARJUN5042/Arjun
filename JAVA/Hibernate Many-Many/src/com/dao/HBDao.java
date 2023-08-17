package com.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Students;
import com.model.Subjects;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	public void addStudent(Students s)
	{
		session=new HBUtil().getSessionData();
		tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("Student Record Inserted....");
	}
	public void addSubject(Subjects ss)
	{
		session=new HBUtil().getSessionData();
		tx=session.beginTransaction();
		session.save(ss);
		tx.commit();
		session.close();
		System.out.println("Subject Record Inserted....");
	}
}
