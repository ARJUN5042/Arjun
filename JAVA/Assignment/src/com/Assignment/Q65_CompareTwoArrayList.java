package com.Assignment;

import java.util.ArrayList;

public class Q65_CompareTwoArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		
		a2.add("Apple");
		a2.add("Banana");
		a2.add("Cherry");
//		a2.add("Kiwi");
		
		System.out.println("ArrayList1 is... "+a1);
		System.out.println("ArrayList2 is... "+a2);
		
		if(a1.equals(a2))
		{
			System.out.println("This Two ArrayList are Equal...");
		}
		else
		{
			System.out.println("This Two ArrayList are not Equal...");
		}
	}
}
