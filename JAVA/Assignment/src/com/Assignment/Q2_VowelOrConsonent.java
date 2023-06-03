package com.Assignment;

import java.util.Scanner;

public class Q2_VowelOrConsonent 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Single Character : ");
		String input = sc.next();
		
		char c=input.charAt(0);
		
		if(input.length()!=1 || !Character.isLetter(input.charAt(0)))
		{
			System.out.println("Error!!!!! Input character is not Letter or More than One Character...");
		}
		else
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println("You Entered : "+c);
				System.out.println("And It is Vowel......");
			}
			else
			{
				System.out.println("You Entered : "+c);
				System.out.println("And It is Consonant......");
			}
		}
	}
}
