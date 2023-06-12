package com.sw;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class FirstEvent implements ActionListener
{
	JFrame frame;
	JLabel l1,msg;
	JTextField t1;
	JPasswordField p1;
	JButton b1;
	
	public FirstEvent() 
	{
		frame = new JFrame("First Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		l1=new JLabel("Enter Your Name : ");
		t1=new JTextField(15);
		p1=new JPasswordField(15);
		b1=new JButton("Display");
		b1.addActionListener(this);
		msg = new JLabel(" ");
		
		frame.add(l1);
		frame.add(t1);
		frame.add(p1);
		frame.add(b1);
		frame.add(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			msg.setText("UserName : "+t1.getText() + " , Password : "+p1.getText());
		}
		
	}
}
public class FirstDemoTwo 
{
	public static void main(String[] args) 
	{
		new FirstEvent();
	}
}
