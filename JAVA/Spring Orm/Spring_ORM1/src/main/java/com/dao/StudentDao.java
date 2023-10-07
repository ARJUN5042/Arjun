package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

public class StudentDao {
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void insert(Student s) {
		hibernateTemplate.saveOrUpdate(s);
	}

	@Transactional
	public List<Student> getAllStudent() {
		return hibernateTemplate.loadAll(Student.class);
	}

	@Transactional
	public Student getStudent(int sid) {
		return hibernateTemplate.get(Student.class, sid);
	}

	@Transactional
	public void update(Student s) {
		hibernateTemplate.saveOrUpdate(s);
	}

	@Transactional
	public void delete(int sid) {
		Student s = hibernateTemplate.get(Student.class, sid);
		hibernateTemplate.delete(s);
	}
}
