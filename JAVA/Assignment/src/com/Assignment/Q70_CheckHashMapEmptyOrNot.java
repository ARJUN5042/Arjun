package com.Assignment;

import java.util.HashMap;

public class Q70_CheckHashMapEmptyOrNot 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		
		h1.put(0, "Arjun");
		
		System.out.println("HashMap is: "+h1);
		
		if(h1.isEmpty())
		{
			System.out.println("The HashMap is Empty...");
		}
		else
		{
			System.out.println("The HashMap is not Empty...");
		}
	}
}
