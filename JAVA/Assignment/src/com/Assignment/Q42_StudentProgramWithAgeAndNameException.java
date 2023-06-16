package com.Assignment;

//creating exception class for age exception 
class AgeNotWithinRangeException extends Exception
{
	String errorMessage;
	public AgeNotWithinRangeException(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage()
	{
		return errorMessage;
	}
}
//creating exception class for name exception
class NameNotValidException extends Exception
{
	String errorMessage;
	public NameNotValidException(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
//creating class for throws above exception
class Student
{
	//initialize data members
	int rollNo;
	String name;
	int age;
	String course;
	//creating parameterized constructor
	public Student(int rollNo, String name, int age, String cource)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	//creating method and throws both exception in it
	public void student() throws AgeNotWithinRangeException, NameNotValidException
	{
		if(age < 15 || age > 21)//making age condition
		{
			throw new AgeNotWithinRangeException("Age is not within the valid range of 15-21.");
		}
		if(!name.matches("^[a-zA-Z]*$*"))//making name condition
		{
			throw new NameNotValidException("Name contains numbers or special symbols.");
		}
	}
}
public class Q42_StudentProgramWithAgeAndNameException 
{
	public static void main(String[] args) 
	{
		//using try...catch block for handle exceptions
		try 
		{
			Student s = new Student(1, "Arjun Hirpara", 15, "Java");//creating object of class and passing values
			s.student();//calling method
			//Display values
			System.out.println("Student profile Created ");
			System.out.println("rno: "+s.rollNo);
			System.out.println("Name: "+s.name);
			System.out.println("Age: "+s.age);
			System.out.println("Course: "+s.course);
		} catch (AgeNotWithinRangeException e)//catch block for age exception 
		{
			//if age is not between 15 and 21 than handled by this exception
			System.out.println(e.getErrorMessage());
			e.printStackTrace();
		}
		catch (NameNotValidException e)//catch block for name exception
		{
			//if name contains numbers or special character than handled by this exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
