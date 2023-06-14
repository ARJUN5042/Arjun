package com.Assignment;

import java.util.Scanner;

public class Q9_CountNumbersLettersSpacesOtherCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=sc.nextLine();//taking user input
		//display that string
		System.out.println("You Entered : "+s);
		//initializing variables for counting
		int letters=0;
		int numbers=0;
		int spaces=0;
		int specialCharacter=0;
		//using for loop to check every character
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetter(ch))//using to check character is letter or not
			{
				letters++;
			}
			else if(Character.isDigit(ch))//using to check character is digit or not
			{
				numbers++;
			}
			else if(Character.isWhitespace(ch))//using to check string have white space or not
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