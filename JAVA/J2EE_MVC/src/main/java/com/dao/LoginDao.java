package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBUtil;

import model.UserModel;

public class LoginDao 
{
	Connection cn=null;
	UserModel model=null;
	public UserModel getLogin(UserModel lmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from user where username=? and password=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getUsername());
			st.setString(2, lmodel.getPassword());
			
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new UserModel();
				model.setUserid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setUsername(rs.getString(4));
				model.setPassword(rs.getString(5));
				
				cn.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
	}
}
