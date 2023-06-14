package com.Assignment;

import java.util.HashMap;

public class Q70_CheckHashMapEmptyOrNot 
{
	public static void main(String[] args) 
	{
		//creating HashMap
		HashMap h1 = new HashMap();
		//putting values
		h1.put(0, "Arjun");
		//display HashMap
		System.out.println("HashMap is: "+h1);
		//making conditions to check HashMap is empty or not
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
