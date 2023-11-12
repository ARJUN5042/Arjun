package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.AddServicesModel;
import com.model.AdminModel;
import com.model.AssignServicemanModel;
import com.model.BookModel;
import com.model.RatingFeedbackModel;
import com.model.SubServiceModel;
import com.util.DBUtil;

public class AdminDao 
{
	Connection cn;
	int x=0;
	public AdminModel getAdmin(AdminModel amodel)
	{
		AdminModel model=null;
		cn=new DBUtil().getConnectionData();
		String qry="select * from admin where username=? and password=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, amodel.getUsername());
			st.setString(2, amodel.getPassword());
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				model=new AdminModel();
				model.setUsername(rs.getString(1));
				model.setPassword(rs.getString(2));
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
	public int addMainServices(AddServicesModel asm)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into services(servicename,image) values(?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, asm.getServicename());
			st.setString(2, asm.getImage());
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
	public int addSubServices(SubServiceModel ssm)
	{
		x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into subservices(serviceid,subsname,content,image,price) values(?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, ssm.getServiceid());
			st.setString(2, ssm.getSubsname());
			st.setString(3, ssm.getContent());
			st.setString(4, ssm.getImage());
			st.setString(5, ssm.getPrice());
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return x;
	}
	
	public int assignServiceman(AssignServicemanModel asm)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into assignserviceman(servicemanid,serviceid,subid,bid,customerid,adate) values(?,?,?,?,?,?)";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, asm.getServicemanid());
			st.setInt(2, asm.getServiceid());
			st.setInt(3, asm.getSubid());
			st.setInt(4, asm.getBid());
			st.setInt(5, asm.getCustomerid());
			st.setString(6, asm.getAdate());
			x=st.executeUpdate();
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int assignedService(BookModel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="Update book set bstatus=? where bid=?";
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
	
	public void updateRating(int bid,int rating,String feedback)
	{	
		cn=new DBUtil().getConnectionData();
	
		String qry="update rating_feedback set rating=?,feedback=? where bid=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, rating);
			st.setString(2, feedback);
			st.setInt(3, bid);
			int x=st.executeUpdate();
			if(x>0)
			{
				System.out.println("updated");
			}
			else {
				System.out.println("error");
			}
			cn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
