package com.simple;

public class Condition4 
{
	public static void main(String[] args) 
	{
		int a=1000,b=1000,c=1000;
		if(a>=b && a>=c)
		{
			System.out.println("A is Max");
		}
		else if(b>=a && b>=c)
		{
			System.out.println("B is Max");
		}
		else if(c>=a && c>=b)
		{
			System.out.println("C is Max");
		}
	}
}
