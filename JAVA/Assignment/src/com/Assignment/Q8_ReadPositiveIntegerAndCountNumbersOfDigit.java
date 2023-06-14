package com.Assignment;

import java.util.Scanner;

public class Q8_ReadPositiveIntegerAndCountNumbersOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Positive Numbers : ");
		long n=sc.nextLong();//user input for positive number
		//making condition for user input is correct or not
		if(n<=0)
		{
			System.out.println("Please Enter a positive Number");
		}
		else
		{
			int count=0;//initialize
			while(n>0)//condition
			{
				count++;//updation //making count +1 at every time get into loop
				n/=10;
			}
			System.out.println("The number of digits is: "+count);
		}
		sc.close();
	}
}
