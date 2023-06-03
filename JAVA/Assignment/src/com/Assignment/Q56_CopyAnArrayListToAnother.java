package com.Assignment;

import java.util.ArrayList;

public class Q56_CopyAnArrayListToAnother 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		
		System.out.println("Original ArrayList is... "+a1);
		
		ArrayList<String> c1 = new ArrayList<String>();
		c1.addAll(a1);
		
		System.out.println("Copy ArrayList is... "+c1);
	}
}
