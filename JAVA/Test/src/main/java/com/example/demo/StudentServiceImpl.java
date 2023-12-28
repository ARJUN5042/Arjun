package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
	StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public String create(Student s) {
		// TODO Auto-generated method stub
		studentRepository.save(s);
		return "Created";
	}

	@Override
	public String update(Student s) {
		// TODO Auto-generated method stub
		studentRepository.save(s);
		return "updated";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "deleted";
	}

	@Override
	public Student getbyID(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	
}
