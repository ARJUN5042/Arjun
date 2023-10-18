package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Person p1=(Person)context.getBean("p1");
		System.out.println(p1);
		Person p2=(Person)context.getBean("p2");
		System.out.println(p2);
	}
}
