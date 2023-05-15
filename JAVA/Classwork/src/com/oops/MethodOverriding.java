package com.oops;

class First
{
	public void display()
	{
		System.out.println("This is First Class Display Method...");
	}
}
class Second extends First
{
	public void display()
	{
		System.out.println("This is Second Class Display Method...");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
//		Second s1=new Second();
//		s1.display();//only call sub class method
		
		First f1=new First();
		f1.display();//only call super class method
		f1=new Second();// method overriding for call child class method
		f1.display();//only call sub class method
	}
}
