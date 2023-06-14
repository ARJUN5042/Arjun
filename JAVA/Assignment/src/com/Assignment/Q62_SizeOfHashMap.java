package com.Assignment;

import java.util.HashMap;

public class Q62_SizeOfHashMap 
{
	public static void main(String[] args) 
	{
		//creating HashMap with key and value
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		//putting values
		h1.put(1, "Apple");
		h1.put(2, "Banana");
		h1.put(3, "Orange");
		h1.put(4, "Grape");
		h1.put(5, "Kiwi");
		//display elements
		System.out.println("HashMap elements are: "+h1);
		//display size of HashMap
		System.out.println("Size of HashMap is: "+h1.size());
	}
}
