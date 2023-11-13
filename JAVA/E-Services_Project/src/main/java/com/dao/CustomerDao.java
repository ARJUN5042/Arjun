package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.BookModel;
import com.model.CustomerModel;
import com.model.RatingFeedbackModel;
import com.util.DBUtil;

public class CustomerDao 
{
	Connection cn=null;
	CustomerModel model=null;
	public CustomerModel doLogin(CustomerModel lmodel)
	{
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
			e.printStackTrace();
		}		
		return model;
	}
	public int doRegister(CustomerModel rmodel)
	{
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
			e.printStackTrace();
		}		
		return x;
	}
	public int payment(BookModel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="Update book set bstatus=?,pstatus=? where bid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, bmodel.getBstatus());
			st.setString(2, bmodel.getPstatus());
			st.setInt(3, bmodel.getBid());
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return x;
	}
	public int getBookID(int customerid)
	{
		int bid=0;
		cn=new DBUtil().getConnectionData();
		String qry="select max(bid) from book where customerid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, customerid);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				bid=rs.getInt(1);
			}
			cn.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return bid;
	}
	
	public int getCustomerid(int customerid)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select customerid from customer";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				customerid=rs.getInt(1);
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return customerid;
	}
	
	public int updateCustomer(CustomerModel hmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update customer set firstname=?,lastname=?,gender=?,address=?,city=?,pincode=?,mobno=? where customerid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, hmodel.getFirstname());
			st.setString(2, hmodel.getLastname());
			st.setString(3, hmodel.getGender());
			st.setString(4, hmodel.getAddress());
			st.setString(5, hmodel.getCity());
			st.setInt(6, hmodel.getPincode());
			st.setString(7, hmodel.getMobno());
			st.setInt(8, hmodel.getCustomerid());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return x;
	}
	
	public int updatePassword(CustomerModel hmodel,String currentPassword)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update customer set password=? where customerid=? and password=? ";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, hmodel.getPassword());
			st.setInt(2, hmodel.getCustomerid());
			st.setString(3,currentPassword);
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return x;
	}
	
	public int insertRating(RatingFeedbackModel rfm)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into rating_feedback(assignid,servicemanid,serviceid,subid,bid,customerid,rating,feedback) values(?,?,?,?,?,?,?,?)";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, rfm.getAssignid());
			st.setInt(2, rfm.getServicemanid());
			st.setInt(3, rfm.getServiceid());
			st.setInt(4, rfm.getSubid());
			st.setInt(5, rfm.getBid());
			st.setInt(6, rfm.getCustomerid());
			st.setInt(7, rfm.getRating());
			st.setString(8, rfm.getFeedback());
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
