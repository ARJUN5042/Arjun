package com.Assignment;
import java.util.Scanner;

public class Q1_GreatestNumberFromInput 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Values:-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = sc.nextInt();//Taking input for a
		System.out.println("Enter B: ");
		int b = sc.nextInt();//Taking input for b
		System.out.println("Enter C: ");
		int c = sc.nextInt();//Taking input for c
		sc.close();
		
		//Making conditions for greater number
		
		if(a>b && a>c)
		{
			System.out.println(a+" is Greater.");
		}
		else if(b>c && b>a)
		{
			System.out.println(b+" is Greater.");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is Greater.");
		}
		else if(a==b && a>c)
		{
			System.out.println(a+" is Greater.");
		}
		else if(b==c && b>a)
		{
			System.out.println(b+" is Greater");
		}
		else if(c==a && c>b)
		{
			System.out.println(c+" is Greater");
		}
		else if(a==b && b==c && a==c)
		{
			System.out.println(a+" is Greater");
		}
		else
		{
			System.out.println("Invalid Input!!!");
		}
	}
}
