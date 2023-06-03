package com.Assignment;

import java.util.Scanner;

public class Q17_ComparingEndCharacterOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1=sc.next();
		System.out.println("Enter String 2: ");
		String s2=sc.next();
		
		boolean b1=s1.endsWith(s2);
		
		System.out.println("Comparing End Character of String:");
		System.out.println(s1+" and "+s2+" : "+b1);
	}
}
