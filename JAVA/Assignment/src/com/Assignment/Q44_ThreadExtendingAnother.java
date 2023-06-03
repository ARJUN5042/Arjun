package com.Assignment;

class Thread2 extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println("Thread started..."+i);
		}
		System.out.println("Thread is done...");
	}
}
public class Q44_ThreadExtendingAnother 
{
	public static void main(String[] args) 
	{
		Thread2 t1 = new Thread2();
		t1.start();
	}
}
