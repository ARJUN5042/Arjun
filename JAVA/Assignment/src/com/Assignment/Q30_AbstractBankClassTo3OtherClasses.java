package com.Assignment;
//creating abstract super class
abstract class Bank
{
	//creating abstract return type method so do not specify the body part
	public abstract int getBalance();
}
//creating sub class of super class
class BankA extends Bank
{
	//initialize data member with some value
	private int balance = 100;
	//overriding abstract method of super class and specify the body part
	public int getBalance()
	{
		return balance;
	}
}
//creating sub class of super class
class BankB extends Bank
{
	//initialize data member with some value
	private int balance = 150;
	public int getBalance()
	{
		return balance;
	}
}
//creating sub class of super class
class BankC extends Bank
{
	//initialize data member with some value
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
		//creating object of every sub class
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();
		//calling method of every sub class
		System.out.println("Balance in Bank A: "+b1.getBalance()+"$");
		System.out.println("Balance in Bank B: "+b2.getBalance()+"$");
		System.out.println("Balance in Bank C: "+b3.getBalance()+"$");
	}
}
