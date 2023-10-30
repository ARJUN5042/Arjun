package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.UserModel;
import com.util.DBUtil;

public class ForgotDao 
{
	public UserModel checkEmail(String email)
	{
		UserModel f=new UserModel();
		try
		{
		Connection conn=new DBUtil().getConnectionData();
		String qry="select * from user where email=?";
		PreparedStatement st=conn.prepareStatement(qry);
		st.setString(1, email);
		ResultSet rs=st.executeQuery();
		if(rs.next())
		{
			f.setUid(rs.getInt(1));
			f.setEmail(rs.getString("email"));
			f.setFirstname(rs.getString(2));
			f.setLastname(rs.getString(3));
		}
		else
		{
			System.out.println("Model is null");
			f=null;
		}
		conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	public int resetPassword(UserModel f)
	{
		int r=0;
		try
		{
			Connection conn=new DBUtil().getConnectionData();
			String sql="update user set password=? where uid=?";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1, f.getPassword());
			st.setInt(2, f.getUid());
			r=st.executeUpdate();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return r;
	}
}
