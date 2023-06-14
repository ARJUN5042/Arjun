package com.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q69_ConvertHashSetToListOrArrayList 
{
	public static void main(String[] args) 
	{
		//creating Hashset
		HashSet<String> h1 = new HashSet<String>();
		//adding values
		h1.add("Arjun");
		h1.add("Sanjay");
		h1.add("Satyam");
		h1.add("Shyam");
		h1.add("Keval");
		//display HashSet
		System.out.println("HashSet is: "+h1);
		//creating List object and store Hashset into ArrayList
		List<String> l1 = new ArrayList<>(h1);
		//display ArrayList
		System.out.println("After Converting HashSet into ArrayList: "+l1);
	}
}
