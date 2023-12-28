package com.example.demo;

import java.util.List;

public interface StudentService 
{
	public String create(Student s);
	public String update(Student s);
	public String delete(int id);
	public Student getbyID(int id);
	public List<Student> getAll();
}
