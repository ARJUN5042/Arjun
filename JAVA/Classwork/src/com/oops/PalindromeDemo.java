package com.oops;

import java.util.Scanner;

public class PalindromeDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		int copy=no;
		int sum=0;
		while(no>0)
		{
			int t=no%10;
			sum=(sum*10)+t;
			no=no/10;
		}
		System.out.println(sum);
		if(sum==copy)
		{
			System.out.println("Palindrome Number : "+sum);
		}
		else
		{
			System.out.println("Not Palindrome Number : "+sum);
		}
		sc.close();
	}
}
