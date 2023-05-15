package com.cls;


class Student
{
	public void show() {}
}

public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);
		System.out.println("Autoboxing is... "+i1);
		
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is... "+i2);
		
		int x=i1.intValue();
		System.out.println("Unboxing is... "+x);
		
		String s="786";
		int z=Integer.parseInt(s);
		System.out.println("Real Unboxing is... "+z);
//		---------------------------------------------------
		Object o1=new Object();
		Student s1=new Student();
		o1=s1;
		System.out.println("Object call is... "+o1);
		
	}
}
