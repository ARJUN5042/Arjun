package com.Assignment;
import java.util.Scanner;

public class Q5_SumAndAverage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float sum=0;
		double average=0;
		int n=5;
		System.out.println("Enter 5 Numbers");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter number "+i+": ");
			float a= sc.nextFloat();
			sum += a;
		}
		System.out.println("Sum of 5 numbers are: "+sum);
		
		average = (double)sum/n;
		
		System.out.println("Average of 5 numbers are: "+average);
		sc.close();
	}
}
