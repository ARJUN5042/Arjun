package com.Assignment;

import java.util.Scanner;

public class Q17_ComparingEndCharacterOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1=sc.next();	//first input from user
		System.out.println("Enter String 2: ");
		String s2=sc.next();	//second input from user
		
		boolean b1=s1.endsWith(s2); //check end character is same or not
		
		System.out.println("Comparing End Character of String:");
		System.out.println(s1+" and "+s2+" : "+b1);	//print that string and result
		sc.close();
	}
}
