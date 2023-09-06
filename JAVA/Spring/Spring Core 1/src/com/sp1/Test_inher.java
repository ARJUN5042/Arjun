package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_inher 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=(Student)context.getBean("s2");
		s1.halfDisplay();
		s1.fullDisplay();			
	}
}
