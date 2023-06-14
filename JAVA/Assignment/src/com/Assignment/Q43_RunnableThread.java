package com.Assignment;
//creating class and implements in runnable state
class Thread1 implements Runnable
{
	//creating run method
	@Override
	public void run() 
	{
//		using for loop to creating looping process
		for(int i=0;i<=5;i++)
		{
//			using try..i.catch block
			try 
			{
				Thread.sleep(1000);//every thread time gap
			} 
			catch (InterruptedException e) //if any error occurs it will be handled by catch block
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
		Thread1 t1 = new Thread1();//creating object of class
		Thread t2 = new Thread(t1);//creating thread object and pass the class object in it
		t2.start();//start the thread
	}
}
