package com.Assignment;

class Member
{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	public Member(String name, int age,	String phoneNumber,	String address, double salary) 
	{
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	public void printSalary()
	{
		System.out.println("Salary of "+name+" is: "+salary);
	}
}
public class Q25_PrintSalary 
{
	public static void main(String[] args) 
	{
		Member m1=new Member("Arjun", 26, "7383851940", "Ahmedabad", 25000);
		m1.printSalary();
	}
}
