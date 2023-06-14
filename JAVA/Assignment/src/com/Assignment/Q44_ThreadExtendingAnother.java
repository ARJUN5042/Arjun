package com.Assignment;
//creating class and extends in thread
class Thread2 extends Thread
{
	//creating run method
	@Override
	public void run() 
	{
		//using for loop
		for(int i=0;i<=5;i++)
		{
			//using try...catch block
			try 
			{
				Thread.sleep(1000);//every process time gap
			} 
			catch (Exception e) //if any error occurs then it will handled by catch block
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
		Thread2 t1 = new Thread2();//creating object of class
		t1.start();//start thread
	}
}
