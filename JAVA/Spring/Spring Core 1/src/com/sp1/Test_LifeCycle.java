package com.sp1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_LifeCycle 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Message m1=(Message)context.getBean("m1");
		System.out.println(m1.getMsg());
		
		context.registerShutdownHook();
	}
}
