package com.Assignment;

import java.util.Scanner;

public class Q10_PrintASCIIValueForGivenCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Single Character : ");
		char ch=sc.nextLine().charAt(0);
		//Using Type Casting to converting char into int
		int asciiValue=(int)ch;
		
		System.out.println("You Entered : "+ch+" And ASCII Value is : "+asciiValue);
	}
}
