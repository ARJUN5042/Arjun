package com.sw;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

class FourthEvent implements AdjustmentListener
{
	JFrame frame;
	JScrollBar h,v;
	JLabel h1,v1;
	public FourthEvent() 
	{
		frame = new JFrame("Fourth Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		h=new JScrollBar(JScrollBar.HORIZONTAL,1, 5, 1, 100);
		h.addAdjustmentListener(this);
		v=new JScrollBar(JScrollBar.VERTICAL,1, 5, 1, 100);
		v.addAdjustmentListener(this);
		h1 = new JLabel(" ");
		v1 = new JLabel(" ");
		frame.add(h);
		frame.add(h1);
		frame.add(v);
		frame.add(v1);
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		if(e.getSource()==h)
		{
			h1.setText("Horizontal : "+h.getValue());
		}
		else
		{
			v1.setText("Vertical : "+v.getValue());
		}		
	}
	
}
public class FourthDemoTwo 
{
	public static void main(String[] args) 
	{
		new FourthEvent();
	}
}
