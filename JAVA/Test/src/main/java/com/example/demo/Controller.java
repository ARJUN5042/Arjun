package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller 
{
	StudentService studentService;

	public Controller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> showAll()
	{
		return studentService.getAll();
	}
	
	@GetMapping("/{id}")
	public Student showOne(@PathVariable("id") int id)
	{
		return studentService.getbyID(id);
	}
	
	@PostMapping
	public String create(@RequestBody Student s)
	{
		studentService.create(s);
		return "Created done";
	}
	
	@PutMapping
	public String update(@RequestBody Student s)
	{
		studentService.update(s);
		return "Updated done";
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable("id") int id)
	{
		studentService.delete(id);
		return "Deleted done";
	}
}
