package com.oops;

class Student1 //is a grandparent
{
	public Student1()
	{
		System.out.println("This is Student1 Class.");
	}
	int sno;
	String sname;
	public void setStudentData()
	{
		sno=123;
		sname="Arjun";
	}
}
class Staff extends Student1 //staff is an Parent class
{
	public Staff()
	{
		System.out.println("This is Staff Class.");
	}
	String stname,subject;
	public void setStaffData()
	{
		stname="Rahul Sanghavi";
		subject="Java";
	}
}
class Result extends Staff
{
	public Result()
	{
		System.out.println("This is Result Class.");
	}
	String grade;
	public void setResultData()
	{
		grade="A+";			
	}
	public void showData()
	{
		System.out.println("Sno is "+sno);
		System.out.println("Sname is "+sname);
		System.out.println("Stname is "+stname);
		System.out.println("Subject is "+subject);
		System.out.println("Grade is "+grade);
	}
}
public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		Result s1= new Result();
		s1.setStudentData();
		s1.setStaffData();
		s1.setResultData();
		s1.showData();
	}
}
