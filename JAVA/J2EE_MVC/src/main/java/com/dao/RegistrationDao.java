package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DBUtil;

import model.UserModel;

public class RegistrationDao 
{
	Connection cn=null;
	int x=0;
	public int doRegister(UserModel rmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into user(firstname,lastname,username,password) values(?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getUsername());
			st.setString(4, rmodel.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
}
