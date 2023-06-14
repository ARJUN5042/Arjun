package com.Assignment;
//creating class and extends in thread
class TwiceThread extends Thread
{
	//creating run method
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
		TwiceThread t1 = new TwiceThread();//creating object of class
		t1.start();//thread start
		t1.start();//thread start second time which will create error
	}
}
