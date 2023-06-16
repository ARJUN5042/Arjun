package com.Assignment;
//creating class
class Interleaving
{
	//creating static method with arguments
	public static void findAllInterleaving(String s1, String s2, String interleaved, String current)
	{
		//making condition to check string is empty or not
		if (s1.isEmpty() && s2.isEmpty()) 
		{
			System.out.print(interleaved + current);
		}
		//making condition and recursion method in it for string 1 
		if (!s1.isEmpty()) 
		{
            findAllInterleaving(s1.substring(1), s2, interleaved + current, s1.substring(0, 1));
        }
		//making condition and recursion method in it for string 2
		if (!s2.isEmpty()) 
		{
            findAllInterleaving(s1, s2.substring(1), interleaved + current, s2.substring(0, 1));
        }
	}
}
public class Q19_InterleavingOfString 
{
	public static void main(String[] args) 
	{
		//initialize 2 strings with value
		String s1="WX";
		String s2="YZ";
		//display original strings
		System.out.println("String1 is : "+s1);
		System.out.println("String2 is : "+s2);
		
		System.out.print("Interleaving of String are :");
		Interleaving.findAllInterleaving(s1,s2," ","");//display interleaving strings
	}
}
