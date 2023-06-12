package com.Assignment;

class Interleaving
{
	public static void findAllInterleaving(String s1, String s2, String interleaved, String current)
	{
		if (s1.isEmpty() && s2.isEmpty()) 
		{
			System.out.print(interleaved + current);
		}
		if (!s1.isEmpty()) 
		{
            findAllInterleaving(s1.substring(1), s2, interleaved + current, s1.substring(0, 1));
        }
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
		String s1="WX";
		String s2="YZ";
		System.out.println("String1 is : "+s1);//printing string 1
		System.out.println("String2 is : "+s2);//printing string 2
		
		System.out.print("Interleaving of String are :");
		Interleaving.findAllInterleaving(s1,s2," ","");//printing interleaving strings
	}
}
