package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q55_SortElementInArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(3);
		a1.add(1);
		a1.add(56);
		a1.add(23);
		a1.add(6);
		a1.add(11);
		
		System.out.println("ArrayList is... "+a1);
		
		Collections.sort(a1);
		
		System.out.println("ArrayList After Sorting Elements... "+a1);
	}
}
