package com.collection;



public class Practice 
{
	public static void main(String[] args) 
	{
		printNumbers(1, 10);
        System.out.println();
        printNumbers(10, 1);
	}
	public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.print(start + " ");
            printNumbers(start + 1, end);
        } else if(start >= end){
            System.out.print(end + " ");
            printNumbers(start, end - 1);
        }
        else {
        	System.out.println("End");
        }
	}
}
