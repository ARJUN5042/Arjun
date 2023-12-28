package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import com.model.User;
import com.util.DBUtil;

public class UserDao 
{
	Connection cn=null;
	User user=null;
	public int insert(User user)
	{
		int x=0;
		cn=new DBUtil().getConnection();
		String qry="insert into user(name,address,mobile,gender,hobbies,profilepic,email,password) values(?,?,?,?,?,?,?,?)";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, user.getName());
			st.setString(2, user.getAddress());
			st.setString(3, user.getMobile());
			st.setString(4, user.getGender());
			st.setString(5, String.join(",", user.getHobbies()));
			st.setString(6, user.getProfilepic());
			st.setString(7, user.getEmail());
			st.setString(8, user.getPassword());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public User getLogin(User u)
	{
		cn=new DBUtil().getConnection();
		String qry="select * from user where email=? and password=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, u.getEmail());
			st.setString(2, u.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				user=new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setAddress(rs.getString(3));
				user.setMobile(rs.getString(4));
				user.setGender(rs.getString(5));
				List<String> hobbiesList = Arrays.asList(rs.getString(6).split(","));
				user.setHobbies(hobbiesList);
				user.setProfilepic(rs.getString(7));
				user.setEmail(rs.getString(8));
				user.setPassword(rs.getString(9));
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	public User getLogin(int id)
	{
		cn=new DBUtil().getConnection();
		String qry="select * from user where id=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				user=new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setAddress(rs.getString(3));
				user.setMobile(rs.getString(4));
				user.setGender(rs.getString(5));
				List<String> hobbiesList = Arrays.asList(rs.getString(6).split(","));
				user.setHobbies(hobbiesList);
				user.setProfilepic(rs.getString(7));
				user.setEmail(rs.getString(8));
				user.setPassword(rs.getString(9));
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	
	public int update(User u)
	{
		int x=0;
		cn=new DBUtil().getConnection();
		String qry="update user set name=?,address=?,mobile=?,gender=?,hobbies=?,profilepic=?,email=?,password=? where id=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, u.getName());
			st.setString(2, u.getAddress());
			st.setString(3, u.getMobile());
			st.setString(4, u.getGender());
			st.setString(5, String.join(",", u.getHobbies()));
			st.setString(6, u.getProfilepic());
			st.setString(7, u.getEmail());
			st.setString(8, u.getPassword());
			st.setInt(9, u.getId());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int delete(int id)
	{
		int x=0;
		cn=new DBUtil().getConnection();
		String qry="delete from user where id=?";
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
}
