package com.Assignment;
//creating class
class Vote
{
	int age;//initialize data member
	//creating method and throws in arithmetic exception
	public static void validate(int age) throws ArithmeticException
	{
		if(age<18)
		{
			//using throw and new keyword before exception
			throw new ArithmeticException("not valid");
		}
	}
}
public class Q40_VoteProgramUsingThrows 
{
	public static void main(String[] args) 
	{
		int age = 19;
//		using try.age..catch block
		try 
		{
			Vote.validate(age);//calling method via class name
			System.out.println("Welcome to Vote!!");
		} 
		catch (ArithmeticException e) //catch block for exception
		{
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
