package com.Assignment;
import java.util.Scanner;

public class Q3_LeapYearOrNot 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Year : ");
		Scanner year = new Scanner(System.in);
		int y = year.nextInt();//Input for Users
		year.close();
		
		//Creating condition for Leap Year
		if(y%4==0)
		{
			System.out.println(y+" is a Leap Year.");
		}
		else
		{
			System.out.println(y+" is not a Leap Year.");
		}
	}
}
