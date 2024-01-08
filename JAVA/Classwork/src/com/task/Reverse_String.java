package com.task;

public class Reverse_String 
{
	public static String reverse(String input)
	{
		StringBuilder build=new StringBuilder();
		for(int i=input.length()-1;i>=0;i--)
		{
			build.append(input.charAt(i));
		}
		return build.toString();
	}
	public static void main(String[] args) {
		String input="hello";
		System.out.println(reverse(input).length());
	}
}
