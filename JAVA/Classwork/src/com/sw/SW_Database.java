package com.sw;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DBDemo implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,msg;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;
	public DBDemo() 
	{
		frame=new JFrame("First Database Demo");
		frame.setLayout(new GridLayout(7, 2));
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Enter Your Rno: ");
		l2=new JLabel("Enter Your Name: ");
		l3=new JLabel("Enter Your City: ");
		l4=new JLabel("Enter Your Degree: ");
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		t4=new JTextField(15);
		b1=new JButton("Insert");
		b2=new JButton("Update");
		b3=new JButton("Delete");
		b4=new JButton("Display");
		msg=new JLabel(" ");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(l4);
		frame.add(t4);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(msg);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			int rno=Integer.parseInt(t1.getText().toString());
			String name=t2.getText();
			String city=t3.getText();
			String degree=t4.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
				System.out.println("Connection Established...");
				Statement st=cn.createStatement();
				String qry="insert into student values("+rno+",'"+name+"','"+city+"','"+degree+"')";
				int x=st.executeUpdate(qry);
				if(x>0)
				{
					msg.setText("Record inserted successfully");
				}
				else
				{
					msg.setText("Record not inserted");
				}
				cn.close();
			} catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
				System.out.println("Connection Established...");
				Statement st=cn.createStatement();
				String qry="update student set name='"+t2.getText()+"',city='"+t3.getText()+"',degree='"+t4.getText()+"' where rno="+Integer.parseInt(t1.getText())+"";
				int x=st.executeUpdate(qry);
				if(x>0)
				{
					msg.setText("Record updated successfully");
				}
				else
				{
					msg.setText("Record not updated");
				}
				cn.close();
			} catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
				System.out.println("Connection Established...");
				Statement st=cn.createStatement();
				String qry="delete from student where rno="+Integer.parseInt(t1.getText())+"";
				int x=st.executeUpdate(qry);
				if(x>0)
				{
					msg.setText("Record deleted successfully");
				}
				else
				{
					msg.setText("Record not deleted");
				}
				cn.close();
			} catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
				System.out.println("Connection Established...");
				Statement st=cn.createStatement();
				String qry="select * from student";
				
				ResultSet rs=st.executeQuery(qry);
				
				while(rs.next())
				{
					System.out.println("RollNo is "+rs.getInt(1));
					System.out.println("Name is "+rs.getString(2));
					System.out.println("City is "+rs.getString(3));
					System.out.println("Degree is "+rs.getString(4));
					System.out.println();
				}
			} catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
}
public class SW_Database 
{
	public static void main(String[] args) 
	{
		new DBDemo();
	}
}
