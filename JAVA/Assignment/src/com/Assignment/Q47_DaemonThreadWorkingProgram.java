package com.Assignment;
//creating class and extends in thread
class Thread3 extends Thread
{
	//creating run method
	@Override
	public void run() 
	{
		//using try...catch block
		try 
		{
			Thread.sleep(1000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		//making condition for checking daemon thread
		if(Thread3.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Started...");
		}
		else
		{
			System.out.println("This is a normal Thread...");
		}
		//using try...catch block
		try 
		{
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		//making condition for again checking daemon thread
		if(Thread3.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Finished...");
		}
		else
		{
			System.out.println("Normal Thread Finished...");
		}
	}
}
public class Q47_DaemonThreadWorkingProgram 
{
	public static void main(String[] args) 
	{
		Thread3 t1 = new Thread3();//creating object of class
		Thread3 d1 = new Thread3();//creating another object for daemon thread of class
		
		d1.setDaemon(true); //making thread daemon
		
		t1.start();//normal thread start
		d1.start();//daemon thread start
		//now trying to set normal thread as daemon thread
		t1.setDaemon(true);//if this execute then upper execution will got error
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Main Thread Finished...");
	}
}
