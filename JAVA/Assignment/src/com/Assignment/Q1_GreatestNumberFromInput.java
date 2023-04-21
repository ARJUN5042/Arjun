package com.Assignment;
import java.util.Scanner;

public class Q1_GreatestNumberFromInput 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Values:-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = sc.nextInt();
		System.out.println("Enter B: ");
		int b = sc.nextInt();
		System.out.println("Enter C: ");
		int c = sc.nextInt();
		sc.close();
		
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
