package com.Assignment;

import java.util.Scanner;

class NoBalance extends Exception
{
	double amount;
	public NoBalance(double amount)
	{
		this.amount = amount;
	}
}
class Transaction
{
	double balance;
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+ " Rs. Deposited...");
	}
	public void withdrawal(double amount) throws NoBalance
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println(amount+ " Rs. Withdrawal...");
		}
		else
		{
			double needs = amount - balance;
			throw new NoBalance(needs);
		}
	}
}
public class Q41_WithdrawalProgramUsingException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Transaction t1=new Transaction();
		System.out.println("Enter Amount for Deposit : ");
		double amount=sc.nextDouble();
		t1.deposit(amount);
		
		System.out.println("Enter Amount for Withdrawal : ");
		amount=sc.nextDouble();
		try 
		{
			t1.withdrawal(amount);
		} catch (NoBalance e) 
		{
			System.out.println("Sorry, Insufficient balance, you need more "+e.amount+"Rs. To perform this transaction.");
			e.printStackTrace();
		}
	}
}
