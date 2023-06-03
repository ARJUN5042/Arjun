package com.ex;

import java.util.Scanner;

class NoAmountInATM extends Exception
{
	double amount;
	public NoAmountInATM(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+" rs Deposited....");
	}
	public void withdrawal(double amount) throws NoAmountInATM
	{
		if(amount<=balance)
		{
			balance -= amount;
			System.out.println(amount+" rs. Withdrawal Successfully....");
		}
		else
		{
			double needs=amount-balance;
			throw new NoAmountInATM(needs);
		}
	}
}
public class CustomExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter Amount for Deposit : ");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		
		System.out.println("Enter Amount for Withdrawal : ");
		amount=sc.nextDouble();
		
		try 
		{
			a1.withdrawal(amount);
		}catch (NoAmountInATM e) 
		{
			System.out.println("You need to more "+e.amount+" rs to withdrawal "+amount+" rs.");
			e.printStackTrace();
		}
	}
}
