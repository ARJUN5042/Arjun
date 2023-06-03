package com.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q54_SearchElementinArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		
		System.out.println("ArrayList is... "+a1);
		
		System.out.println("Enter Element to search :");
		Scanner sc = new Scanner(System.in);
		String search = sc.next();
		
		if(a1.contains(search))
		{
			System.out.println("The Element you search is at Index : "+a1.indexOf(search));
		}
		else 
		{
			System.out.println("Specified Element not found...");
		}
	}
}
