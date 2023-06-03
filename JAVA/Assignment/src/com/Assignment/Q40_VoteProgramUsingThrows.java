package com.Assignment;

class Vote
{
	int age;
	public static void validate(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
	}
}
public class Q40_VoteProgramUsingThrows 
{
	public static void main(String[] args) 
	{
		int age = 19;
		
		try 
		{
			Vote.validate(age);
			System.out.println("Welcome to Vote!!");
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
