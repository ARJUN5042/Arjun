package com.Assignment;

import java.util.Scanner;

public class Q38_AboveProgramUsingNestedTryCatchBlock 
{
	public static void main(String[] args) 
	{
		//using try...catch block
		try 
		{
			Scanner sc = new Scanner(System.in);
			//using nested try...catch block
			try 
			{
				System.out.println("Enter No1: ");
				int a1=sc.nextInt();//taking user input
				System.out.println("Enter No2: ");
				int a2=sc.nextInt();//taking user input
				int a3=a1/a2;
				System.out.println("Division is: "+a3);//display output
				
				int[] a = new int[5];//initialize an array
				a[6]=10;//creating abnormal condition for arrayIndexOutOfBoundsException
				sc.close();
			}
			catch (ArithmeticException e) //catch block for arithmetic exception
			{
				System.out.println("Divident Error...");
				e.printStackTrace();
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) //catch block for array exception
		{
			System.out.println("Array Error...");
			e.printStackTrace();
		}
		catch (Exception e) //catch block for other exception
		{
			System.out.println("Other Error...");
			e.printStackTrace();
		}
	}
}
