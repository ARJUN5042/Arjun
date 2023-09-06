package com.sp1;

public class Person1 
{
	String name;
	Phone phone;
	public Person1(String name, Phone phone) 
	{
		this.name = name;
		this.phone = phone;
	}
	public void callPerson()
	{
		System.out.println("Name is ... "+name);
		phone.callPhone();
	}
}
