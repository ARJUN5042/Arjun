package com.simple;

public class Condition2 
{
	public static void main(String[] args) 
	{
		int no=10;
		if(no%2==0)
		{
			System.out.println("Number is Even"+no);
		}
		else
		{
			System.out.println("Number is Odd"+no);
		}
		
		int year=2004;
		if(year%4==0)
		{
			System.out.println("Your Year is Leapyear.."+year);
		}
		else
		{
			System.out.println("Your Year is not a Leapyear..."+year);
		}
	}
}
