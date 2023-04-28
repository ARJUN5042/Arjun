package com.oops;

class Student
{
	int sid;
	String sname, city;
	private void setDataValue()
	{
		sid=1;
		sname="Arjun";
		city="Ahmedabad";
	}
	public void show()
	{
		setDataValue();
		System.out.println("Sid is "+sid);
		System.out.println("Sname is "+sname);
		System.out.println("City is "+city);
	}
}

public class ClassDemo 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();//s1 is an object is an instance of an class
		s1.show();
//		s1.setDataValue();
		s1.show();
	}
}
