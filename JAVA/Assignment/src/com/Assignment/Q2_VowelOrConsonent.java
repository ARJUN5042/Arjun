package com.Assignment;
import java.util.Scanner;

public class Q2_VowelOrConsonent 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphaber: ");
		String ch=sc.next();
		
		if(ch=='a')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
