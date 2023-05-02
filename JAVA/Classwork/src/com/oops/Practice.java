package com.oops;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) 
	{
//		Write a Java program to print the ASCII value of a given character.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your number: ");
		int num= 1;
		int sum=1;
//		int copy=num;
		
		while(num>0)
		{
			System.out.println();
			int t=num%10;
			sum=(sum*10)*t;
			System.out.print(" "+num+" ");
			num*=11;
		}
//		sc.close();
	}
}
