package com.Assignment;

import java.util.Scanner;

public class Q37_MultipleCatchBlock 
{
	public static void main(String[] args) 
	{
		//using try...catch block
		try
		{
			//creating user input type error
			//if user divide number with zero then it will handled by exception
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No1: ");
			int m=sc.nextInt();
			System.out.println("Enter No2: ");
			int n=sc.nextInt();
			int o=m/n;
			System.out.println("Division is: "+o);
			System.out.println("Division is Completed...");
			
			//For array index Exception
			int[] a= new int[5];
			a[5] = 30;//creating error in array index
			sc.close();
		}
		catch(ArithmeticException e)//handle for divided by zero
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)//handle for array index
		{
			e.printStackTrace();
		}
	}
}
