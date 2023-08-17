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
	public UserModel getLogin(int userid)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from user where userid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, userid);
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	int x=0;
	public int updateUser(UserModel homemodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="update user set firstname=?,lastname=?,username=?,password=? where userid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, homemodel.getFirstname());
			st.setString(2, homemodel.getLastname());
			st.setString(3, homemodel.getUsername());
			st.setString(4, homemodel.getPassword());
			st.setInt(5, homemodel.getUserid());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
	public int deleteUser(int userid)
	{
		cn=new DBUtil().getConnectionData();
		String qry="delete from user where userid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, userid);
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
}
