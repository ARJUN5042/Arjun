package com.Assignment;

import java.util.HashSet;

public class Q58_AppendHashSet 
{
	public static void main(String[] args) 
	{
		//creating HashSet
		HashSet<String> name = new HashSet<String>();
		//adding values
		name.add("Arjun");
		name.add("Sanjay");
		name.add("Satyam");
		//display values
		System.out.println("Original Arraylist: "+name);
		//adding values
		name.add("Hirpara");
		//display values
		System.out.println("After Adding Element in ArrayList: "+name);
	}
}
