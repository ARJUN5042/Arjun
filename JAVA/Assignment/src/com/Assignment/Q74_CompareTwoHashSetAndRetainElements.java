package com.Assignment;

import java.util.HashSet;

public class Q74_CompareTwoHashSetAndRetainElements 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		HashSet<String> h2 = new HashSet<String>();
		
		h1.add("Apple");
		h1.add("Banana");
		h1.add("Grapes");
		h1.add("Cherry");
		h1.add("Watermelon");
		
		h2.add("Apple");
		h2.add("Banana");
		h2.add("Mango");
		h2.add("Kiwi");
		h2.add("Grapes");
		
		System.out.println("HashSet1 is: "+h1);
		System.out.println("HashSet2 is: "+h2);
		
		if(h1.equals(h2))
		{
			System.out.println("Both HashSet are Equal...");
		}
		else
		{
			System.out.println("Both HashSet are not Equal...");
		}
		
		h1.retainAll(h2);
		
		System.out.println("The Same elements of both HashSets are : "+h1);
	}
}
