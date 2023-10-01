package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.StudentModel;
import com.util.DBUtil;

public class RegistrationDao 
{
	Connection cn=null;
	int x=0;
	StudentModel smodel=null;
	public int doRegister(StudentModel smodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into student(fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, smodel.getFname());
			st.setString(2, smodel.getLname());
			st.setString(3, smodel.getEmail());
			st.setString(4, smodel.getMobile());
			st.setString(5, smodel.getGender());
			st.setString(6, smodel.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public StudentModel getLogin(StudentModel smodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from student where email=? and password=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, smodel.getEmail());
			st.setString(2, smodel.getPassword());
			
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				smodel=new StudentModel();
				smodel.setSid(rs.getInt(1));
				smodel.setFname(rs.getString(2));
				smodel.setLname(rs.getString(3));
				smodel.setEmail(rs.getString(4));
				smodel.setMobile(rs.getString(5));
				smodel.setGender(rs.getString(6));
				smodel.setPassword(rs.getString(7));
				
				
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return smodel;
	}
	
}
