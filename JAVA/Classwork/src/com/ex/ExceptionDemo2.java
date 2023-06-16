package com.ex;

import java.util.Scanner;

public class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int[] a=new int[5];
			for(int i=0;i<=5;i++)
			{
				System.out.println("Enter Value : ");
				a[i]=sc.nextInt();
				System.out.println(a[i]);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
