package com.Assignment;

class AgeNotWithinRangeException extends Exception
{
	private String errorMessage;
	public AgeNotWithinRangeException(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage()
	{
		return errorMessage;
	}
}
class NameNotValidException extends Exception
{
	private String errorMessage;
	public NameNotValidException(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
class Student
{
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	public Student(int rollNo, String name, int age, String cource)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
		
		if(age < 15 || age > 21)
		{
			throw new AgeNotWithinRangeException("Age is not within the valid range of 15-21.");
		}
		if(name.matches(".*\\d.*") || !name.matches("^[a-zA-Z]*$*"))
		{
			throw new NameNotValidException("Name contains numbers or special symbols.");
		}
	}
}
public class Q42_StudentProgramWithAgeAndNameException 
{
	public static void main(String[] args) 
	{
		try 
		{
			Student s = new Student(1, "Arjun Hirpara", 15, "Java");
			System.out.println("Student Created: "+s);
		} catch (s.AgeNotWithinRangeException e) 
		{
			System.out.println("Error creating Student: "+e.getErrorMessage());
		}
		catch (s.NameNotValidException e)
		{
			System.out.println("Error creating student: "+e.getMessage());
		}
	}
}
