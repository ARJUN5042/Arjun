package com.test;

import com.dao.HBDao;
import com.model.Employee;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		Employee e=new Employee();
//		e.setEid(1);
//		e.setEname("Rahul");
//		e.setCity("S.Nagar");
//		e.setDesg("Sr. Dev");
//		dao.addEmployee(e);
//		e.setEid(1);
//		e.setEname("Rocky");
//		e.setCity("G.Nagar");
//		e.setDesg("Dev");
//		dao.updateEmployee(e);
		e.setEid(1);
		dao.deleteEmployee(e);
	}
}
