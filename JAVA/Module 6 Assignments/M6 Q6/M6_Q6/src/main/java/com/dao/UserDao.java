package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

public class UserDao 
{
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insert(User u)
	{
		hibernateTemplate.saveOrUpdate(u);
	}
	
	@Transactional
	public List<User> getAllUser()
	{
		return hibernateTemplate.loadAll(User.class);
	}
	
	@Transactional
	public User getUser(int id)
	{
		return hibernateTemplate.load(User.class, id);
	}
	
	@Transactional
	public void update(User u)
	{
		hibernateTemplate.saveOrUpdate(u);
	}
	
	@Transactional
	public void delete(int id)
	{
		User u=hibernateTemplate.get(User.class, id);
		hibernateTemplate.delete(u);
	}
	
}
