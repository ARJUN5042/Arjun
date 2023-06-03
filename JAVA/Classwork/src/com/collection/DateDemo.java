package com.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		
		SimpleDateFormat s1= new SimpleDateFormat("dd/MM/yyyy a");
		System.out.println(s1.format(d1));
	}
}
