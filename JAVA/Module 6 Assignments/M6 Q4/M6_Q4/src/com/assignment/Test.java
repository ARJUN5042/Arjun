package com.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	 public static void main(String[] args) {
	        // Load the Spring context from beans.xml
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	        // Retrieve the studentList bean from the context
	        List<Student> students = context.getBean("studentList", List.class);

	        // Print student information
	        for (Student student : students) {
	            System.out.println("Student ID: " + student.getId());
	            System.out.println("First Name: " + student.getFname());
	            System.out.println("Last Name: " + student.getLname());
	            System.out.println("Email: " + student.getEmail());
	            System.out.println("Mobile: " + student.getMobile());
	            System.out.println();
	        }
	    }
}
