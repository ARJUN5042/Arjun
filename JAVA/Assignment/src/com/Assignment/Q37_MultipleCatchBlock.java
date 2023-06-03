package com.Assignment;

import java.util.Scanner;

public class Q37_MultipleCatchBlock 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] a = new int[5];
			a[5] =30/0;
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	error;
}
