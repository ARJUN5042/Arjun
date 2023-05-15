package com.Assignment;

import java.util.Scanner;

public class Q2_VowelOrConsonent 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Single Character : ");
		String input = sc.next();
		
//		boolean uppercase = input.charAt(0)>=65 && input.charAt(0)<=90;
//		boolean lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
//		boolean vowels = input.equals("a")||input.equals("A")||input.equals("e")||input.equals("E")||input.equals("i")||input.equals("I")||input.equals("o")||input.equals("O")||input.equals("u")||input.equals("U");
//		
		if(input.length()!=1)
		{
			System.out.println("You Entered morethan one character...");
		}
	}
}
