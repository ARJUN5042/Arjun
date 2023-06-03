package com.Assignment;

import java.util.Scanner;
class Check
{
	public static boolean checkStartWord(String string, String s)
	{
		return string.startsWith(s);
	}
}
public class Q18_CheckStartingWordSameORNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s="Red";
		System.out.println("First Word of String should be: "+s);
		
		System.out.println("Enter String 1: ");
		String s1=sc.next();
		System.out.println(Check.checkStartWord(s1, s));
		
		sc.nextLine();
		System.out.println("Enter String 2: ");
		String s2=sc.next();
		System.out.println(Check.checkStartWord(s2, s));
		
		sc.nextLine();
		System.out.println("Enter String 3: ");
		String s3=sc.next();
		System.out.println(Check.checkStartWord(s3, s));
		
	}
	
}
