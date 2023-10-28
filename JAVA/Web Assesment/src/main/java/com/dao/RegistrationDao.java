package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class RegistrationDao 
{
	Connection cn=null;
	public int doRegister(UserModel u)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into user(firstname,lastname,email,mobile,address,gender,password) values(?,?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, u.getFirstname());
			st.setString(2, u.getLastname());
			st.setString(3, u.getEmail());
			st.setString(4, u.getMobile());
			st.setString(5, u.getAddress());
			st.setString(6, u.getGender());
			st.setString(7, u.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
}
