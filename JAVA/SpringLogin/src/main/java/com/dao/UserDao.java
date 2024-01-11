package com.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.UserModel;

public class UserDao 
{
	HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	@Transactional
	public void insert(UserModel u)
	{
		ht.saveOrUpdate(u);
	}
	
	@Transactional
	public void update(UserModel u)
	{
		ht.update(u);
	}
	
	public UserModel getById(int id)
	{
		return ht.load(UserModel.class, id);
	}
	
	public List<UserModel> getAl()
	{
		return ht.loadAll(UserModel.class);
	}
	
	@Transactional
	public void delete(int id)
	{
		ht.delete(getById(id));
	}
	
	public UserModel loginUser(String email, String password)
	{
		String qry="from UserModel where email=:email and password=:password";
		UserModel u=(UserModel)ht.execute(s -> {
			Query q=s.createQuery(qry);
			q.setString("email", email);
			q.setString("password", password);
			return q.uniqueResult();
		});
		return u;
	}
}
