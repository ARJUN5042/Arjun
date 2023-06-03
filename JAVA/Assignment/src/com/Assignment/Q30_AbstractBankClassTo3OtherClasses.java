package com.Assignment;

abstract class Bank
{
	public abstract int getBalance();
}
class BankA extends Bank
{
	private int balance = 100;
	public int getBalance()
	{
		return balance;
	}
}
class BankB extends Bank
{
	private int balance = 150;
	public int getBalance()
	{
		return balance;
	}
}
class BankC extends Bank
{
	private int balance = 200;
	public int getBalance()
	{
		return balance;
	}
}
public class Q30_AbstractBankClassTo3OtherClasses 
{
	public static void main(String[] args) 
	{
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();
		
		System.out.println("Balance in Bank A: "+b1.getBalance()+"$");
		System.out.println("Balance in Bank B: "+b2.getBalance()+"$");
		System.out.println("Balance in Bank C: "+b3.getBalance()+"$");
	}
}
