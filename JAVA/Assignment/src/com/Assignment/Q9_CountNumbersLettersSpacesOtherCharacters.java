package com.Assignment;

import java.util.Scanner;

public class Q9_CountNumbersLettersSpacesOtherCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something: ");
		String test=sc.nextLine();
		System.out.println(test);
		count(test);		
		sc.close();
	}
	public static void count(String x)
	{
		char[] ch = x.toCharArray();
		int letter =0;
		int space =0;
		int num =0;
		int other =0;
		for(int i=0;i<x.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Letter: "+letter);
		System.out.println("Space: "+space);
		System.out.println("Number: "+num);
		System.out.println("Others: "+other);
	}
}
