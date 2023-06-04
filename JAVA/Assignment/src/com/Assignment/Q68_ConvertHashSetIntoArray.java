package com.Assignment;

import java.util.HashSet;

public class Q68_ConvertHashSetIntoArray 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		
		 h1.add("Red");
	     h1.add("Yellow");
	     h1.add("Black");
	     h1.add("Blue");
	     h1.add("Purple");
	     
	     String[] s1 = new String[h1.size()];
	     h1.toArray(s1);
	     
	     System.out.println("HashSet is: "+h1);
	     
	     System.out.println("HashSet To Array is: ");
	     for(String s : s1)
	     {
	    	 System.out.println(s + " ");
	     }
	}
}
