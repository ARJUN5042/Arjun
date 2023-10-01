package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;


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
}
