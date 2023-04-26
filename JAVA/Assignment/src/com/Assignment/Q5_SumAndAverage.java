package com.Assignment;
import java.util.Scanner;

public class Q5_SumAndAverage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float sum=0;
		double average=0;
		int n=5; //Initializing that the number of input is 5
		System.out.println("Enter 5 Numbers");
		//Using for loop for user input
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter number "+i+": ");
			float a= sc.nextFloat();
			sum += a;//sum = sum + a: for sum of numbers
		}
		System.out.println("Sum of 5 numbers are: "+sum);
		
		average = (double)sum/n;//Creating Average Formula
		
		System.out.println("Average of 5 numbers are: "+average);
		sc.close();
	}
}
