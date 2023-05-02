package com.oops;

import java.util.Scanner;

public class ArmstrongNumber 
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
			sum=sum+(t*t*t);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Right Arm Strong Number: "+sum);
		}
		else
		{
			System.out.println("Wrong "+sum);
		}
		sc.close();
	}
}
