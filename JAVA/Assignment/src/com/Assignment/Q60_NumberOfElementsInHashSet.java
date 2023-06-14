package com.Assignment;

import java.util.HashSet;

public class Q60_NumberOfElementsInHashSet 
{
	public static void main(String[] args) 
	{
		//creating HashSet
		HashSet h1 = new HashSet();
		//display default size
		System.out.println("Default Size is... "+h1.size());
		//adding values
		h1.add("Black");
		h1.add("White");
		h1.add("Red");
		h1.add("Yellow");
		h1.add("Blue");
		//display current size and values
		System.out.println("Now Size is... "+h1.size());
		System.out.println("HashSet is: "+h1);
	}
}
