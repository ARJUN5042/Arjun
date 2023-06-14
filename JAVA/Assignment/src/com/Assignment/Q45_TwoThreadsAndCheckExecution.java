package com.Assignment;

public class Q45_TwoThreadsAndCheckExecution 
{
	public static void main(String[] args) 
	{
		//creating for loop for first thread
		for(int i=1;i<=3;i++)
		{			
			try 
			{
				Thread.sleep(2000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println("My First Thread is..."+i);
		}
		//creating for loop for second thread
		for(int i=1;i<=3;i++)
		{			
			try 
			{
				Thread.sleep(2000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println("My Second Thread is..."+i);
		}
	}
}
