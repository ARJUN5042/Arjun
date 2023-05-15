package com.oops;

class Addition
{
	int x,y;
	public void sum()
	{
		x=10;
		y=20;
		System.out.println("Sum is ... "+(x+y));
	}
	public void sum(int a)
	{
		x=y=a;
		System.out.println("Sum2 is ... "+(x+y));
	}
	public void sum(float a)
	{
		x=y=(int)a;
		System.out.println("Sum3 is ... "+(x+y));
	}
	public void sum(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("Sum4 is ... "+(x+y));
	}
}
public class MethodOverloadingDemo 
{
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.sum();
		a1.sum(123);
		a1.sum(124.2f);
		a1.sum(123,456);
	}
}
