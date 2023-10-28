package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class LoginDao 
{
	Connection cn=null;
	public UserModel doLogin(UserModel u)
	{
		UserModel model=null;
		cn=new DBUtil().getConnectionData();
		String qry="Select * from user where email=? and password=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, u.getEmail());
			st.setString(2, u.getPassword());
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
}
