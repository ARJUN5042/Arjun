package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.StudentModel;
import com.util.DBUtil;

public class HomeDao 
{
	Connection cn=null;
	StudentModel smodel=null;
	public StudentModel getLogin(int sid)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from student where sid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, sid);
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
	int x=0;
	public int updateUser(StudentModel smodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="update student set fname=?,lname=?,email=?,mobile=?,gender=?,password=? where sid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, smodel.getFname());
			st.setString(2, smodel.getLname());
			st.setString(3, smodel.getEmail());
			st.setString(4, smodel.getMobile());
			st.setString(5, smodel.getGender());
			st.setString(6, smodel.getPassword());
			st.setInt(7, smodel.getSid());
			
			x=st.executeUpdate();
			cn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public int deleteInsertUser(StudentModel smodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into deleterecord(sid,fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, smodel.getSid());
			st.setString(2, smodel.getFname());
			st.setString(3, smodel.getLname());
			st.setString(4, smodel.getEmail());
			st.setString(5, smodel.getMobile());
			st.setString(6, smodel.getGender());
			st.setString(7, smodel.getPassword());
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
	public int deleteUser(int sid)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="delete from student where sid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, sid);
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
}
