package com.Assignment;

import java.util.Scanner;

public class Q8_ReadPositiveIntegerAndCountNumbersOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Positive Numbers : ");
		long n=sc.nextLong();
		if(n<=0)
		{
			System.out.println("Please Enter a positive Number");
		}
		else
		{
			int count=0;
			while(n>0)
			{
				count++;
				n/=10;
			}
			System.out.println("The number of digits is: "+count);
		}
		sc.close();
	}
}
