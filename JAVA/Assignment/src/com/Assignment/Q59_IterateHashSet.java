package com.Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Q59_IterateHashSet 
{
	public static void main(String[] args) 
	{
		//creating HashSet
		HashSet h1 = new HashSet();
		//display default value
		System.out.println("Default Value is... "+h1);
		//adding values
		h1.add("Black");
		h1.add("White");
		h1.add("Red");
		h1.add("Yellow");
		h1.add("Blue");
		//display current size and values
		System.out.println("Now Size is... "+h1.size());
		System.out.println("Original Hashset is: "+h1);
		//using iterator for seperating elements
		Iterator i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
