package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.EmployeeModel;

public class Dao 
{
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insert(EmployeeModel e)
	{
		hibernateTemplate.save(e);
	}
	
	@Transactional
	public void update(EmployeeModel e)
	{
		hibernateTemplate.update(e);
	}
	
	public List<EmployeeModel> getAll()
	{
		return hibernateTemplate.loadAll(EmployeeModel.class);
	}
	
	public EmployeeModel getById(int id)
	{
		return hibernateTemplate.get(EmployeeModel.class, id);
	}
	
	@Transactional
	public void delete(int id)
	{
		hibernateTemplate.delete(getById(id));
	}
}
