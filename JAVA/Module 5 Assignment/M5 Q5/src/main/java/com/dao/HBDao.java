package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Address;
import com.model.Student;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	String msg="";
	
	public String insertStudentData(Student student)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(student);
			tx.commit();
			session.close();
			msg="Data Insert is Successful...";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}
	
	public String insertAddressData(Address address)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(address);
			tx.commit();
			session.close();
			msg="Data Insert is Successfully.....";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}
	
	Address address=null;
	public Address getData(int addressId)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from Address a where a.addressId=?0");
			q.setParameter("addressId", addressId);
			List<Address> lists=q.list();
			address=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			address=null;
			e.printStackTrace();
		}
		return address;
	}
}
