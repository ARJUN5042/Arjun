package com.Assignment;

import java.util.Scanner;
class Grade
{
	protected int m;
	String grade;
	//creating method for grade according to marks
	public void grade(int m)
	{
		this.m = m;
		if(m<=100 && m>=91)
		{
			grade = "AA";
		}
		else if(m<=90 && m>=81)
		{
			grade = "AB";
		}
		else if(m<=80 && m>=71)
		{
			grade = "BB";
		}
		else if(m<=70 && m>=61)
		{
			grade = "BC";
		}
		else if(m<=60 && m>=51)
		{
			grade = "CD";
		}
		else if(m<=50 && m>=41)
		{
			grade = "DD";
		}
		else
		{
			grade = "Fail";
		}
		System.out.println("Student's mark is "+m+" And  Grade is "+grade);
	}
}
public class Q34_ShowGrades 
{
	public static void main(String[] args) 
	{
		Grade g1 = new Grade();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Students Marks : ");
		int n = sc.nextInt();//taking user input
		g1.grade(n);//calling method
		sc.close();
	}
}

