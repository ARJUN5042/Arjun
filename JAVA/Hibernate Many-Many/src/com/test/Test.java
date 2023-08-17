package com.test;

import java.util.HashSet;

import com.dao.HBDao;
import com.model.Students;
import com.model.Subjects;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		HashSet<Subjects> subjects=new HashSet<Subjects>();
		
		Subjects s1=new Subjects();
		s1.setSubname("Java");
		s1.setDuration("4.5 Month");
		Subjects s2=new Subjects();
		s2.setSubname("ST");
		s2.setDuration("3 Month");
		
		dao.addSubject(s1);
		dao.addSubject(s2);
		
		subjects.add(s1);
		subjects.add(s2);
		
		Students ss1=new Students();
		ss1.setSname("Arjun");
		ss1.setDegree("BE");
		ss1.setSubjects(subjects);
		
		Students ss2=new Students();
		ss2.setSname("Ankita");
		ss2.setDegree("BBA");
		ss2.setSubjects(subjects);
		
		dao.addStudent(ss1);
		dao.addStudent(ss2);
		
	}
}
