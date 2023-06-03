package com.Assignment;

import java.util.Scanner;

class Factorial
{
	public int factorial(int n)
	{
		int f = 1;
		for(int i=1; i<=n;i++)
		{
			f *= i;
		}
		return f;
	}
}
public class Q32_Factorial 
{
	public static void main(String[] args) 
	{
		Factorial f1=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to get Factorial of : ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" is "+f1.factorial(n));
	}
}
