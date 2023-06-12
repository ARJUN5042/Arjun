package com.sw;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


class SecondEvent implements ItemListener
{
	JFrame frame;
	JCheckBox c1,c2,c3;
	JLabel msg;
	
	public SecondEvent() 
	{
		frame = new JFrame("First Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		msg = new JLabel(" ");
		c1=new JCheckBox("Cricket");
		c2=new JCheckBox("Carrom");
		c3=new JCheckBox("Chess");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(msg);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		msg.setText(((JCheckBox)e.getSource()).getText() + " CheckBox is "+(e.getStateChange()==1?"Checked...":"Unchecked..."));
		
	}
}
public class SecondDemoTwo 
{
	public static void main(String[] args) 
	{
		new SecondEvent();
	}
}
