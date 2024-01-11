package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;
import com.util.DBUtil;

public class Dao 
{
	Connection cn=null;
	Model model=null;
	public int insert(Model m)
	{
		int x=0;
		cn=new DBUtil().getConnection();
		String qry="insert into model(name,mobile,email,password) values(?,?,?,?)";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, m.getName());
			st.setString(2, m.getMobile());
			st.setString(3, m.getEmail());
			st.setString(4, m.getPassword());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public Model login(Model m)
	{
		Model model=new Model();
		cn=new DBUtil().getConnection();
		String qry="select * from model where email=? and password=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, m.getEmail());
			st.setString(2, m.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new Model();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setMobile(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setPassword(rs.getString(5));
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
	
	public Model login(int id)
	{
		Model model=new Model();
		cn=new DBUtil().getConnection();
		String qry="select * from model where id=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new Model();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setMobile(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setPassword(rs.getString(5));
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
	public int update(Model m)
	{
		int x=0;
		cn=new DBUtil().getConnection();
		String qry="update model set name=?,mobile=?,email=?,password=? where id=?";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, m.getName());
			st.setString(2, m.getMobile());
			st.setString(3, m.getEmail());
			st.setString(4, m.getPassword());
			st.setInt(5, m.getId());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	
	public int delete(int id)
	{
		cn=new DBUtil().getConnection();
		int x=0;
		String qry="delete from model where id=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, id);
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public List<Model> getAll()
	{
		List<Model> lists=new ArrayList<Model>();
		cn=new DBUtil().getConnection();
		String qry="select * from model";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				Model m=new Model();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setMobile(rs.getString(3));
				m.setEmail(rs.getString(4));
				m.setPassword(rs.getString(5));
				lists.add(m);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lists;
	}
}
