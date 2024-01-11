package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

public class StudentDao 
{
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insert(Student s)
	{
		hibernateTemplate.save(s);
	}
	
	@Transactional
	public void update(Student s)
	{
		hibernateTemplate.update(s);
	}
	
	public Student getById(int id)
	{
		return hibernateTemplate.load(Student.class, id);
	}
	
	public List<Student> getAll()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
	
	@Transactional
	public void delete(int id)
	{
		hibernateTemplate.delete(getById(id));
	}
	
	public Student login(String email, String password)
	{
		String qry="FROM Student where email=?0 AND password=?1";
		List<Student> lists=(List<Student>) hibernateTemplate.find(qry, email, password);
		if(lists != null && !lists.isEmpty())
		{
			return lists.get(0);
		}
		return null;
	}
}

