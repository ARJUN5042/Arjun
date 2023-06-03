package com.Assignment;

abstract class Parent
{
	public abstract void message();
}
class FirstSubClass extends Parent
{

	@Override
	public void message() 
	{
		System.out.println("This is First Subclass...");		
	}	
}
class SecondSubClass extends Parent
{
	public void message()
	{
		System.out.println("This is Second Subclass...");
	}
}
public class Q29_AbstractDemo 
{
	public static void main(String[] args) 
	{
		Parent p1 = new FirstSubClass();
		p1.message();
		
		Parent p2 = new SecondSubClass();
		p2.message();
		
		FirstSubClass f1 = new FirstSubClass();
		f1.message();
		
		SecondSubClass s1 = new SecondSubClass();
		s1.message();
	}
}
