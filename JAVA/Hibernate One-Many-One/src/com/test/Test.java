package com.test;

import com.dao.HBDao;
import com.model.Department;
import com.model.Employee;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		Department d=new Department();
		d.setDepartment("Computer");
		d.setDesg("Sr. Dev");
		
		dao.addDepartment(d);
		
		Employee e1=new Employee();
		e1.setEname("Arjun");
		e1.setSalary(123456);
		e1.setDept(d);
		dao.addEmployee(e1);
		
		Employee e2=new Employee();
		e2.setEname("Ankita");
		e2.setSalary(234123);
		e2.setDept(d);
		dao.addEmployee(e2);
	}
}
