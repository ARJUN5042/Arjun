package com.sp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Collection 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/sp2/collections.xml");
	Customer c1=(Customer)context.getBean("cc1");
	
}
