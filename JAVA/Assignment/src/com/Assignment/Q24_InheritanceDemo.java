package com.Assignment;

class ParentClass
{
	public void parent()
	{
		System.out.println("This is a parent class...");
	}
}
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
		
		p1.parent();
		c1.child();
		c1.parent();
	}
}
