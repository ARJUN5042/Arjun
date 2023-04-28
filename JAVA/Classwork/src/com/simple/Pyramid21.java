package com.simple;
/*
 * pascal's triangle
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
*/
public class Pyramid21 
{
	public static void main(String[] args) 
	{
	        for (int i=0;i<5;i++) 
	        {
	            for (int k=0;k<5-i;k++) 
	            {
	                System.out.print(" ");
	            }
	            int n=1;
	            for (int j=0;j<=i;j++) 
	            {
	                System.out.print(n+" ");
	                n =n*(i-j)/(j+1);
	            }
	            System.out.println();
	        }
	 }
}



