package com.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q54_SearchElementinArraylist 
{
	public static void main(String[] args) 
	{
		//creating an arraylist
		ArrayList a1 = new ArrayList();
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		//display value
		System.out.println("ArrayList is... "+a1);
		
		System.out.println("Enter Element to search :");
		Scanner sc = new Scanner(System.in);
		String search = sc.next();//user input for searching element
		//creating conditions for elements is exists or not
		if(a1.contains(search))//using contains functions for search
		{
			System.out.println("The Element you search is at Index : "+a1.indexOf(search));
		}
		else 
		{
			System.out.println("Specified Element not found...");
		}
	}
}
