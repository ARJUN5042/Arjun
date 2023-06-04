package com.Assignment;

import java.util.Scanner;

public class Q9_CountNumbersLettersSpacesOtherCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=sc.nextLine();//take user input
		System.out.println("You Entered : "+s);
		//initializing variables for counting
		int letters=0;
		int numbers=0;
		int spaces=0;
		int specialCharacter=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetter(ch))
			{
				letters++;
			}
			else if(Character.isDigit(ch))
			{
				numbers++;
			}
			else if(Character.isWhitespace(ch))
			{
				spaces++;
			}
			else
			{
				specialCharacter++;
			}
		}
		//Display counted letters,spaces,numbers and special character 		
		System.out.println("Letters : "+letters);
		System.out.println("Numbers : "+numbers);
		System.out.println("Spaces : "+spaces);
		System.out.println("Special Character: "+specialCharacter);
		sc.close();
	}
}
