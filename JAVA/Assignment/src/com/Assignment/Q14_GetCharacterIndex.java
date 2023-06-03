package com.Assignment;

import java.util.Scanner;

public class Q14_GetCharacterIndex 
{
	public static void main(String[] args) 
	{
		String original="Tops Technologies!";
		System.out.println(original);
		
		System.out.print("Enter Character : ");
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		
		char c1=original.charAt(i1);
		
		System.out.println("The character at position "+i1+" is : "+c1);
		
		
	}
}
