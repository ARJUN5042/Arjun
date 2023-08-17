package com.test;

import com.dao.HBDao;
import com.model.Employee;
import com.model.ProfileDetails;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		ProfileDetails p=new ProfileDetails();
		p.setAddress("Sola Road");
		p.setCity("Ahmedabad");
		
		dao.addProfileDetails(p);
		
		Employee e=new Employee();
		e.setEname("Arjun");
		e.setDesg("Sr. Dev");
		e.setPd(p);
		
		dao.addEmployee(e);
	}
}
