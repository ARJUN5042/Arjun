package com.sp1;

public class Employee 
{
	private int eid;
	private String ename, desg;
	public Employee() 
	{
		eid=1;
		ename="Rahul";
		desg="Sr. Dev";
	}
	public Employee(int eid, String ename, String desg) 
	{
		this.eid=eid;
		this.ename=ename;
		this.desg=desg;
	}
	public void display()
	{
		System.out.println("Eid is ... "+eid);
		System.out.println("Ename is ... "+ename);
		System.out.println("Desg is ... "+desg);
	}
	
}
