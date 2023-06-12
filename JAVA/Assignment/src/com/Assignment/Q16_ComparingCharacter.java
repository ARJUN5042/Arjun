package com.Assignment;

import java.util.Scanner;

public class Q16_ComparingCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//input 1st string
		System.out.println("Enter String 1: ");
		String s1=sc.next();
		//input 2nd string
		System.out.println("Enter String 2: ");
		String s2=sc.next();
		//creating variable for checking both string is same or not
		boolean b1=s1.contentEquals(s2);
		//display result
		System.out.println("Comparing "+s1+" and "+s2+": "+b1);
		sc.close();
	}
}
