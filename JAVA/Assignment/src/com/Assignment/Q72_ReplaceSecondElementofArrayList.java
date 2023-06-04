package com.Assignment;

import java.util.ArrayList;

public class Q72_ReplaceSecondElementofArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		
		System.out.println("Original ArrayList is: "+a1);
		
		if(a1.size()>=2)
		{
			a1.set(1, "Orange");
		}
		
		System.out.println("After Replacing Second Element ArrayList is: "+a1);
	}
}
