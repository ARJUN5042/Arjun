package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_1 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Message m1=(Message)context.getBean("m1");//auto setter
		System.out.println(m1.getMsg());
		
		Message m2=(Message)context.getBean("m2");
		System.out.println(m2.getMsg());
	}
}
