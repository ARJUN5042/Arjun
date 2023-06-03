package com.Assignment;

import java.util.Scanner;

public class Q38_AboveProgramUsingNestedTryCatchBlock 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			try 
			{
				System.out.println("Enter No1: ");
				int a1=sc.nextInt();
				System.out.println("Enter No2: ");
				int a2=sc.nextInt();
				int a3=a1/a2;
				System.out.println("Division is: "+a3);
				
				int[] a = new int[5];
				a[6]=10;
			}
			catch (ArithmeticException e) 
			{
				System.out.println("Divident Error...");
				e.printStackTrace();
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Error...");
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println("Other Error...");
			e.printStackTrace();
		}
	}
}
