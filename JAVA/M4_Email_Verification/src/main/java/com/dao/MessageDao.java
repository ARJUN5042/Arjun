package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Message;

public class MessageDao 
{
	private Connection connection=null;

	public MessageDao(Connection connection) {
		super();
		this.connection = connection;
	}
	
	public boolean sendMessage(Message message)
	{
		String sql="insert into message(senderid,receiverid,message) values(?,?,?)";
		try(PreparedStatement st=connection.prepareStatement(sql))
		{
			st.setInt(1, message.getSenderId());
			st.setInt(2, message.getReceiverId());
			st.setString(3, message.getMessage());
			
			int rowsAffected=st.executeUpdate();
			return rowsAffected>0;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Message> getMessageByUser(int uid)
	{
		List<Message> messages=new ArrayList<>();
		String sql="select * from message where senderid=? OR receiverid=?";
		try(PreparedStatement st=connection.prepareStatement(sql))
		{
			st.setInt(1, uid);
			st.setInt(2, uid);
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				messages.add(mapResultSetToMessage(rs));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return messages;
	}
	
	private Message mapResultSetToMessage(ResultSet rs) throws SQLException
	{
		Message message=new Message();
		message.setMid(rs.getInt("mid"));
		message.setSenderId(rs.getInt("senderid"));
		message.setReceiverId(rs.getInt("receiverid"));
		message.setMessage(rs.getString("message"));
		return message;
	}
}
