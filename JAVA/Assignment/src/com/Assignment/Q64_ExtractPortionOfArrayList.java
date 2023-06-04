package com.Assignment;

import java.util.ArrayList;

public class Q64_ExtractPortionOfArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Kiwi");
		a1.add("Orange");
		
		System.out.println("ArrayList is... "+a1);
		
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 4));
		System.out.println("Portion of ArrayList... "+a2);
	}
}
