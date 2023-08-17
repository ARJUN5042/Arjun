package com.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory fact=cfg.buildSessionFactory();
		
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("Satyam");
		s1.setCity("Amreli");
		
		session.save(s1);
		tx.commit();
		session.close();
		System.out.println("Student record inserted...");
	}
}
