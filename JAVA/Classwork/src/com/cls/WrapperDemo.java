package com.cls;

class Student
{
	public void show()
	{}
}

public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		//Autoboxing
		Integer i1=new Integer(123);
//		Integer i1=123;
		System.out.println("Autoboxing is...  "+i1);
		
		//Boxing
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is... "+i2);
		
		//Unboxing
		int x=i1.intValue();//.intValue() for unboxing
		System.out.println("Unboxing is... "+x);
		
		String s="786";
		int z=Integer.parseInt(s);//converting string into integer
		System.out.println("Real Unboxing is... "+z);
		
		//Object class
		Object o1=new Object();
		Student s1=new Student();
		s1.show();
		o1=i1;
		System.out.println("O1 is... "+o1);
	}
}
