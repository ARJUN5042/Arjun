package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.Emp;

public class EmpDao 
{
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insert(Emp emp)
	{
		hibernateTemplate.save(emp);
	}
	
	@Transactional
	public void update(Emp emp)
	{
		hibernateTemplate.update(emp);
	}
	
	@Transactional
	public void delete(int id)
	{
		hibernateTemplate.delete(getById(id));
	}
	
	public Emp getById(int id)
	{
		return hibernateTemplate.get(Emp.class, id);
	}
	
	public List<Emp> getAll()
	{
		return hibernateTemplate.loadAll(Emp.class);
	}
}
