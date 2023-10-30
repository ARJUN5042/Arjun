package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class HomeDao 
{
	Connection cn=null;
	UserModel model=null;
	public UserModel getLogin(int uid) 
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from user where uid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, uid);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new UserModel();
				model.setUid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setAddress(rs.getString(6));
				model.setGender(rs.getString(7));
				model.setPassword(rs.getString(8));
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	int x=0;
	public int updatePass(UserModel hmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="update user set password=? where uid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, hmodel.getPassword());
			st.setInt(2, hmodel.getUid());
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
