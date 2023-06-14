package com.Assignment;

import java.util.HashSet;

public class Q74_CompareTwoHashSetAndRetainElements 
{
	public static void main(String[] args) 
	{
		//creating two HashSet objects
		HashSet<String> h1 = new HashSet<String>();
		HashSet<String> h2 = new HashSet<String>();
		//adding values in first HashSet
		h1.add("Apple");
		h1.add("Banana");
		h1.add("Grapes");
		h1.add("Cherry");
		h1.add("Watermelon");
		//adding values in second HashSet
		h2.add("Apple");
		h2.add("Banana");
		h2.add("Mango");
		h2.add("Kiwi");
		h2.add("Grapes");
		//display both HashSets
		System.out.println("HashSet1 is: "+h1);
		System.out.println("HashSet2 is: "+h2);
		//making condition to check both HashSets are equal or not
		if(h1.equals(h2))
		{
			System.out.println("Both HashSet are Equal...");
		}
		else
		{
			System.out.println("Both HashSet are not Equal...");
		}
		//using retainAll function to get common elements in both HashSet
		h1.retainAll(h2);
		
		System.out.println("The Same elements of both HashSets are : "+h1);
	}
}
