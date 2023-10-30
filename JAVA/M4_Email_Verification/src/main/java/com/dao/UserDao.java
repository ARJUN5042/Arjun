package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;
import com.util.DBUtil;
import com.util.EmailUtil;


public class UserDao 
{
	private Connection connection=null;
	
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao(Connection connection) {
		super();
		this.connection = connection;
	}
	
	public boolean createUser(User user)
	{
		String sql="insert into user(firstname,lastname,email,mobile,password) values(?,?,?,?,?)";
		try(PreparedStatement st=connection.prepareStatement(sql))
		{
			st.setString(1, user.getFirstName());
			st.setString(2, user.getLastName());
			st.setString(3, user.getEmail());
			st.setString(4, user.getMobile());
			st.setString(5, user.getPassword());
			int rowsAffected=st.executeUpdate();
			return rowsAffected>0;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}		
	}
	
	public User getUserByEmail(String email)
	{
		String sql="select * from user where email=?";
		try(PreparedStatement st=connection.prepareStatement(sql))
		{
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				return mapResultSetToUser(rs);
			}
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	private User mapResultSetToUser(ResultSet rs) throws SQLException
	{
		User user=new User();
		user.setUid(rs.getInt("uid"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setMobile(rs.getString("mobile"));
		user.setPassword(rs.getString("password"));
		return user;
	}

	public boolean updateUser(User user) 
	{
		String qry="update user set firstname=?,lastname=?,email=?,mobile=?,password=? where uid=?";
		try(PreparedStatement st=connection.prepareStatement(qry))
		{
			st.setString(1, user.getFirstName());
			st.setString(2, user.getLastName());
			st.setString(3, user.getEmail());
			st.setString(4, user.getMobile());
			st.setString(5, user.getPassword());
			st.setInt(6, user.getUid());
			int x=st.executeUpdate();
			return x>0;			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean isEmailRegistered(String email) 
	{
		User f=new User();
		String qry="select * from user where email=?";
		try(PreparedStatement st=connection.prepareStatement(qry))
		{
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				f.setUid(rs.getInt(1));
				f.setEmail(rs.getString("email"));
				f.setFirstName(rs.getString(2));
				f.setLastName(rs.getString(3));
			}
			else
			{
				f=null;
			}
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
