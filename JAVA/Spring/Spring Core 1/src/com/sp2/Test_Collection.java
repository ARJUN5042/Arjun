package com.sp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Collection 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sp2/collections.xml");
		Customer cc1=(Customer)context.getBean("cc1");
		System.out.println(cc1.getLists());
		System.out.println(cc1.getSets());
	}
}
