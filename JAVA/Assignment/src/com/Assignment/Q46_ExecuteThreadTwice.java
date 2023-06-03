package com.Assignment;

class TwiceThread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Thread Execution...");
	}
}
public class Q46_ExecuteThreadTwice 
{
	public static void main(String[] args) 
	{
		TwiceThread t1 = new TwiceThread();
		t1.start();
		t1.start();
	}
}
