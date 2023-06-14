package com.Assignment;
//creating abstract class
abstract class Parent
{
	//creating abstract method so do not specify body part
	public abstract void message();
}
//creating sub class to extend super class
class FirstSubClass extends Parent
{
	//specify body part of abstract method of super abstract class
	@Override
	public void message() 
	{
		System.out.println("This is First Subclass...");		
	}	
}
//creating second sub class to extend super class
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
		Parent p1 = new FirstSubClass();//creating object of parent class
		p1.message();//calling method
		
		Parent p2 = new SecondSubClass();//creating second object of parent class but constructor of sub class
		p2.message();//calling method
		
		FirstSubClass f1 = new FirstSubClass();//creating object of first sub class
		f1.message();//calling method
		
		SecondSubClass s1 = new SecondSubClass();//creating object of second sub class
		s1.message();//calling method
	}
}
