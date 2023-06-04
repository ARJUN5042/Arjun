package com.Assignment;

import java.util.Collection;
import java.util.HashMap;

public class Q75_CollectionViewOfValuesInHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		
		h1.put(1, "Apple");
		h1.put(2, "Banana");
		h1.put(3, "Cherry");
		h1.put(4, "Orange");
		h1.put(5, "Kiwi");
		
		Collection<String> values = h1.values();
		System.out.println("Collection view of the values is: "+values);
	}
}
