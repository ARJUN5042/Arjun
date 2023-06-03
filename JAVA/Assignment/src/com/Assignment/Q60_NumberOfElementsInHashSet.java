package com.Assignment;

import java.util.HashSet;

public class Q60_NumberOfElementsInHashSet 
{
	public static void main(String[] args) 
	{
HashSet h1 = new HashSet();
		
		System.out.println("Default Size is... "+h1.size());
		
		h1.add("Black");
		h1.add("White");
		h1.add("Red");
		h1.add("Yellow");
		h1.add("Blue");
		
		System.out.println("Now Size is... "+h1.size());
		System.out.println("HashSet is: "+h1);
	}
}
