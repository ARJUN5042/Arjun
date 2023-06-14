package com.Assignment;

import java.util.HashSet;

public class Q68_ConvertHashSetIntoArray 
{
	public static void main(String[] args) 
	{
		//creating HashSet
		HashSet<String> h1 = new HashSet<String>();
		//adding values
		h1.add("Red");
	    h1.add("Yellow");
	    h1.add("Black");
	    h1.add("Blue");
	    h1.add("Purple");
	    //store size of HashSet into String
	    String[] s1 = new String[h1.size()];
	    //Convert HashSet into Array
	    h1.toArray(s1);
	    //display HashSet
	    System.out.println("HashSet is: "+h1);
	    //display HashSet into Array
	    System.out.println("HashSet To Array is: ");
	    for(String s : s1)
	    {
	    	System.out.println(s + " ");
	    }
	}
}
