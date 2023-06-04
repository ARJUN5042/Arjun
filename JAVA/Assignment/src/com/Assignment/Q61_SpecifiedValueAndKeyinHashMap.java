package com.Assignment;

import java.util.HashMap;

public class Q61_SpecifiedValueAndKeyinHashMap 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		System.out.println("Default Value is.. "+h1);
		
		h1.put(1, "Black");
		h1.put(2, "Blue");
		h1.put("Red", 3);
		h1.put(4, "Yellow");
		h1.put("Green", 5);
		
		System.out.println("Colors in HashMap are... "+h1);
		
		h1.put(6, "White");
		
		System.out.println("Now Colors in HashMap are... "+h1);
	}
}
