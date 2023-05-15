package com.key;

class Result
{
	String grade="A+";
}
class Staff extends Result implements Student,Sport
{
	String stname;
	public void setStaffData()
	{
		stname="Rahul";
	}
//	@Override
	public void show()
	{
		System.out.println("Sid is... "+sid);
		System.out.println("Sname is... "+sname);
		System.out.println("Staffname is... "+stname);
		System.out.println("Grade is... "+grade);
		System.out.println("Sport is... "+spname);
	}
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Staff s1=new Staff();
		s1.setStaffData();
		s1.show();
		Student.show();
	}
}
