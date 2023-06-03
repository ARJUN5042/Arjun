package com.Assignment;

import java.util.Scanner;

public class Q36_TryCatchDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No1: ");
			int a=sc.nextInt();
			System.out.println("Enter No2: ");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println("Division is: "+c);
			System.out.println("Program Completed...");
			sc.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
