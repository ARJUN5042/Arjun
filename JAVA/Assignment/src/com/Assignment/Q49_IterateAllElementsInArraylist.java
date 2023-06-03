package com.Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q49_IterateAllElementsInArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		System.out.println("Default Size is... "+a1.size());
		System.out.println("Default Value is... "+a1);
		
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		a1.add("Green");
		
		System.out.println("Now Size is... "+a1.size());
		System.out.println("Now Value is... "+a1);
		
		Iterator i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}		
	}
}
