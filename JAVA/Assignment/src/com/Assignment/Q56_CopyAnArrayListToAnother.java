package com.Assignment;

import java.util.ArrayList;

public class Q56_CopyAnArrayListToAnother 
{
	public static void main(String[] args) 
	{
		//creating an arraylist
		ArrayList<String> a1 = new ArrayList<String>();
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		//display value
		System.out.println("Original ArrayList is... "+a1);
		//creating another arraylist object
		ArrayList<String> c1 = new ArrayList<String>();
		//adding first arralist value into second arraylist object
		c1.addAll(a1);
		//display value of second arraylist
		System.out.println("Copy ArrayList is... "+c1);
	}
}
