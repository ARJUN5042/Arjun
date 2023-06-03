package com.Assignment;

class Thread3 extends Thread
{
	@Override
	public void run() 
	{
		try 
		{
			Thread.sleep(1000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		if(Thread3.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Started...");
		}
		else
		{
			System.out.println("This is a normal Thread...");
		}
		
		try 
		{
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
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
		Thread3 t1 = new Thread3();
		Thread3 d1 = new Thread3();
		
		d1.setDaemon(true);
		
		t1.start();
		d1.start();
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
