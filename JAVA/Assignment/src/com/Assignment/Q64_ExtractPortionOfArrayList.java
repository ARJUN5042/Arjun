package com.Assignment;

import java.util.ArrayList;

public class Q64_ExtractPortionOfArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		//adding values
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Kiwi");
		a1.add("Orange");
		//display elements
		System.out.println("ArrayList is... "+a1);
		//creating another object of ArrayList and subList it 
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 4));
		System.out.println("Portion of ArrayList... "+a2);
	}
}
