package com.th;

class First extends Thread
{
	public void run()//running
	{
		for(int i=1;i<=5;i++)
		{			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My First Thread is.. "+i);
		}
		System.out.println("My First Thread is Completed...");
	}
}
public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		First f1=new First();//new born thread
		f1.setName("Arjun");
		f1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(f1);
		f1.start();//runnable
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Main Thread is.. "+i);
		}
		System.out.println("My Main Thread is Completed...");
		
	}
}
