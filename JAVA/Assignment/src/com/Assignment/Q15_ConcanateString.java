package com.Assignment;

public class Q15_ConcanateString 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Hii!");
		StringBuffer s2=new StringBuffer(" Tops Technologies...");
		//printing original strings
		System.out.println("First String: "+s1);
		System.out.println("Second String:"+s2);
		//concanate with using append
		s1.append(s2);
		System.out.println("Concanate String: "+s1);
	}
}
