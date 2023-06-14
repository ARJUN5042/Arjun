package com.Assignment;

import java.util.Scanner;

public class Q36_TryCatchDemo 
{
	public static void main(String[] args) 
	{
		//using try...catch block
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No1: ");
			int a=sc.nextInt();//taking user input
			System.out.println("Enter No2: ");
			int b=sc.nextInt();//taking user input
			
			int c=a/b;
			System.out.println("Division is: "+c);//display output
			System.out.println("Program Completed...");
			sc.close();
		}
		catch (Exception e) //if error occurs then execute catch block
		{
			e.printStackTrace();
		}
	}
}
