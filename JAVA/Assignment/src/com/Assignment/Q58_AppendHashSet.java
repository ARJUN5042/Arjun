package com.Assignment;

import java.util.HashSet;

public class Q58_AppendHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> name = new HashSet<String>();
		name.add("Arjun");
		name.add("Sanjay");
		name.add("Satyam");
		
		System.out.println("Original Arraylist: "+name);
		
		name.add("Hirpara");
		
		System.out.println("After Adding Element in ArrayList: "+name);
	}
}
