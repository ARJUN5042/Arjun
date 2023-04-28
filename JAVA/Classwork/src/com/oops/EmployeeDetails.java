package com.oops;

class Employee
{
	int eid,salary,da,hra,pf,netsal;
	String ename,city;
	public void setData()
	{
		eid=101;
		ename="Arjun";
		city="Ahmedabad";
		salary=12345;
		da=123;
		hra=456;
		pf=789;
	}
	public void calc()
	{
		netsal=salary+da+hra-pf;
	}
	public void display()
	{
		System.out.println("Eid is "+eid);
		System.out.println("EName is "+ename);
		System.out.println("City is "+city);
		System.out.println("Salry is "+salary);
		System.out.println("Da is "+da);
		System.out.println("Hra is "+hra);
		System.out.println("PF is "+pf);
		System.out.println("NetSal is "+netsal);
	}
}

public class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setData();
		e1.calc();
		e1.display();
		
	}
}
