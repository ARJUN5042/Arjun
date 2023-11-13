package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.BookModel;
import com.model.ServicemanModel;
import com.util.DBUtil;

public class ServicemanDao 
{
	Connection cn=null;
	ServicemanModel model=null;
	
	public int doRegiser(ServicemanModel smodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into serviceman(firstname,lastname,email,mobile,address,city,pincode,gender,expertise,password) values(?,?,?,?,?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, smodel.getFirstname());
			st.setString(2, smodel.getLastname());
			st.setString(3, smodel.getEmail());
			st.setString(4, smodel.getMobile());
			st.setString(5, smodel.getAddress());
			st.setString(6, smodel.getCity());
			st.setString(7, smodel.getPincode());
			st.setString(8, smodel.getGender());
			st.setString(9, smodel.getExpertise());
			st.setString(10, smodel.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return x;
	}
	
	public ServicemanModel doLogin(ServicemanModel lmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from serviceman where email=? and password=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new ServicemanModel();
				model.setServicemanid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setAddress(rs.getString(6));
				model.setCity(rs.getString(7));
				model.setPincode(rs.getString(8));
				model.setGender(rs.getString(9));
				model.setExpertise(rs.getString(10));
				model.setPassword(rs.getString(11));
			}
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return model;
	}
	
	public int getSetvicemanId(int servicemanid)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select servicemanid from serviceman";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				servicemanid=rs.getInt(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return servicemanid;
	}
	
	public int updateServiceman(ServicemanModel smodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update serviceman set firstname=?,lastname=?,email=?,mobile=?,address=?,city=?,pincode=?,gender=?,expertise=? where servicemanid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, smodel.getFirstname());
			st.setString(2, smodel.getLastname());
			st.setString(3, smodel.getEmail());
			st.setString(4, smodel.getMobile());
			st.setString(5, smodel.getAddress());
			st.setString(6, smodel.getCity());
			st.setString(7, smodel.getPincode());
			st.setString(8, smodel.getGender());
			st.setString(9, smodel.getExpertise());
			st.setInt(10, smodel.getServicemanid());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int updatePassword(ServicemanModel smodel,String currentPassword)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update serviceman set password=? where servicemanid=? and password=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, smodel.getPassword());
			st.setInt(2, smodel.getServicemanid());
			st.setString(3, currentPassword);
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public ServicemanModel checkEmail(String email)
	{
		ServicemanModel f=new ServicemanModel();
		try {
			Connection conn=new DBUtil().getConnectionData();
			String sql="select * from  serviceman where email=?";
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setString(1, email);
			ResultSet rs=stmt.executeQuery();
			if(rs.next())
			{
				f.setServicemanid(1);
				f.setEmail(rs.getString("email"));
				f.setFirstname(rs.getString(2));
				f.setLastname(rs.getString(3));
			}
			else
			{
				f=null;
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public int resetPassword(ServicemanModel f)
	{
		int r=0;
		try
		{
			cn=new DBUtil().getConnectionData();
			String qry="update serviceman set password=? where servicemanid=?";
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, f.getPassword());
			st.setInt(2, f.getServicemanid());
			r=st.executeUpdate();
			cn.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return r;
	}
	
	public int confirmService(BookModel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update book set bstatus=? where bid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, bmodel.getBstatus());
			st.setInt(2, bmodel.getBid());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public int rejectService(BookModel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update book set bstatus=? where bid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, bmodel.getBstatus());
			st.setInt(2, bmodel.getBid());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int endService(BookModel bmodel,String additionalCharge)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update book set price=price+?, bstatus=? where bid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, additionalCharge);
			st.setString(2, bmodel.getBstatus());
			st.setInt(3, bmodel.getBid());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}

	public String getCustomerEmail(int bid)
	{
		String email=null;
		try {
			Connection conn=new DBUtil().getConnectionData();
			String sql="select customer.email from customer join book on customer.customerid=book.customerid where book.bid=?";
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setInt(1, bid);
			ResultSet rs=stmt.executeQuery();
			if(rs.next())
			{
				email=rs.getString("email");
			}
			else
			{
				email=null;
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}
	
}
