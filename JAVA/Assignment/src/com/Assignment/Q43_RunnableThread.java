package com.Assignment;

class Thread1 implements Runnable
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
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Thread Started..."+i);
		}
		System.out.println("Thread is done...");
	}
}
public class Q43_RunnableThread 
{
	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(t1);
		t2.start();
	}
}
