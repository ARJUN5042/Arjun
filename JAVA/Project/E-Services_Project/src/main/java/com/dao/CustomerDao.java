package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.BookModel;
import com.model.CustomerModel;
import com.util.DBUtil;

public class CustomerDao 
{
	Connection cn=null;
	public CustomerModel doLogin(CustomerModel lmodel)
	{
		CustomerModel model=null;
		
		cn=new DBUtil().getConnectionData();
		String qry="select * from customer where email=? and password=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new CustomerModel();
				model.setCustomerid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setGender(rs.getString(4));
				model.setAddress(rs.getString(5));
				model.setCity(rs.getString(6));
				model.setPincode(rs.getInt(7));
				model.setMobno(rs.getString(8));
				model.setEmail(rs.getString(9));
				model.setPassword(rs.getString(10));
				model.setStatus(rs.getString(11));
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return model;
	}
	public int doRegister(CustomerModel rmodel)
	{
		CustomerModel model=null;
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into customer(firstname, lastname, gender, address, city, pincode, mobno, email, password, status) values(?,?,?,?,?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getGender());
			st.setString(4, rmodel.getAddress());
			st.setString(5, rmodel.getCity());
			st.setInt(6, rmodel.getPincode());
			st.setString(7, rmodel.getMobno());
			st.setString(8, rmodel.getEmail());
			st.setString(9, rmodel.getPassword());
			st.setString(10, rmodel.getStatus());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
	public String getSubServiceName(int subid)
	{
		String subname="";	
		cn=new DBUtil().getConnectionData();
		String qry="select subsname from subservices where subid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, subid);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				subname=rs.getString(1);
			}
			
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return subname;
	}
	public int bookServices(BookModel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into book(subid,customerid,bdate,price,bstatus,pstatus) values(?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, bmodel.getSubid());
			st.setInt(2, bmodel.getCustomerid());
			st.setString(3, bmodel.getBdate());
			st.setString(4, bmodel.getPrice());
			st.setString(5, bmodel.getBstatus());
			st.setString(6, bmodel.getPstatus());
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
	
}
