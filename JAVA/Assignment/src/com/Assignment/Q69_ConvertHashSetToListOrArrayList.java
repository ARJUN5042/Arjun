package com.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q69_ConvertHashSetToListOrArrayList 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		
		h1.add("Arjun");
		h1.add("Sanjay");
		h1.add("Satyam");
		h1.add("Shyam");
		h1.add("Keval");
		
		System.out.println("HashSet is: "+h1);
		
		List<String> l1 = new ArrayList<>(h1);
		
		System.out.println("After Converting HashSet into ArrayList: "+l1);
	}
}
