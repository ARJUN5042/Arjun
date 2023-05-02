package com.oops;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		int sum=0;
		while(no>0)
		{
			int t=no%10;
			sum+=t;
			no/=10;
		}
		System.out.println("Sum of Digit is: "+sum);
		sc.close();
	}
}
