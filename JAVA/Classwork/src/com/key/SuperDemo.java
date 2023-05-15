package com.key;

class A
{
	public A()
	{
		System.out.println("Class A is Constructor...");
	}
	int a=100;
	public void showa()
	{
		System.out.println("A is "+a);
	}
}
class B extends A
{
	public B()
	{
		//super();
		System.out.println("Class B is Constructor...");
	}
	public void showa()
	{
		System.out.println("A is .."+a);
	}
	int b=20;
	int a;
	public void showb()
	{
		super.showa();
		System.out.println("B is "+b);
		System.out.println("Sum is "+(super.a+b));
	}
}
public class SuperDemo 
{
	public static void main(String[] args) 
	{
		B b1=new B();
//		b1.showa();
		b1.showb();
	}
}
