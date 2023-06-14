package com.Assignment;

import java.util.Scanner;
//creating class and extends it in exception
class NoBalance extends Exception
{
	//initialize data member
	double amount;
	//creating constructor
	public NoBalance(double amount)
	{
		this.amount = amount;
	}
}
//creating class for transaction
class Transaction
{
	//initialize data member
	double balance;
	//creating method for deposit
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+ " Rs. Deposited...");
	}
	//creating method for withdrawal and throws in other class
	public void withdrawal(double amount) throws NoBalance
	{
		//making condition for current balance is withdrawable or not
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
		double amount=sc.nextDouble();//user input for deposit
		t1.deposit(amount);
		
		System.out.println("Enter Amount for Withdrawal : ");
		amount=sc.nextDouble();//user input for withdraw
		//using try...catch block
		try 
		{
			t1.withdrawal(amount);//calling withdraw method
		} catch (NoBalance e) //catch block if withdraw amount is not enough
		{
			System.out.println("Sorry, Insufficient balance, you need more "+e.amount+"Rs. To perform this transaction.");
			e.printStackTrace();
		}
		sc.close();
	}
}
