package com.ex;

import java.util.Scanner;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no1 : ");
			int a=sc.nextInt();
			
			System.out.println("Enter no2 : ");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println("Your Division is : "+c);
			System.out.println("Your Program is Completed..");
			sc.close();
		}catch(ArithmeticException e)
		{
			System.out.println("212121");//for checking which exception is used
//			System.out.println(e);
			e.printStackTrace();
		}catch(Exception e)
		{
//			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This program is developed by :");
			System.out.println("Arjun..");
			System.out.println("Mo. no is: 7383851940");
		}
	}
}
