package com.Assignment;
//creating super class
class ParentClass
{
	public void parent()
	{
		System.out.println("This is a parent class...");
	}
}
//creating sub class and extends in super class
class Child extends ParentClass
{
	public void child()
	{
		System.out.println("This is a child class...");
	}
}
public class Q24_InheritanceDemo 
{
	public static void main(String[] args) 
	{
		ParentClass p1=new ParentClass();
		Child c1=new Child();
		
		p1.parent();//calling parent class method with object of parent class
		c1.child();//calling child class method with object of child class
		c1.parent();//calling parent class method with object of child class
	}
}
