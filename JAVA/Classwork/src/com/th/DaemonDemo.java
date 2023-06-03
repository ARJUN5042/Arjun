package com.th;

class Test1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread work...");
		}
		else
		{
			System.out.println("User Thread Work...");
		}
	}
}
public class DaemonDemo 
{
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		Test1 t3=new Test1();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
