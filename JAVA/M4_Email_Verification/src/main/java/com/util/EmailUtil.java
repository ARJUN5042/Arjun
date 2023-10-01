package com.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil 
{
	public static void sendOTP(String toEmail, String otp)
	{
		final String username="hirparaarjun49@gmail.com";
		final String password="pcpjalqcnrjmiwfd";
		
		Properties props=new Properties();
		props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your email provider's SMTP server
        props.put("mail.smtp.port", "587"); // Replace with the appropriate port

        Session session=Session.getInstance(props, new Authenticator() {
        	protected PasswordAuthentication getPasswordAuthentication() {
        		return new PasswordAuthentication(username, password);
        	}
		});
        
        try
        {
        	Message message=new MimeMessage(session);
        	message.setFrom(new InternetAddress(username));
        	message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        	message.setSubject("OTP Verification");
        	message.setText("Your OTP is: "+otp);
        	
        	Transport.send(message);
        	System.out.println("Email sent successfully!");
        }
        catch(MessagingException e)
        {
        	e.printStackTrace();
        	throw new RuntimeException(e);
        }
	}
}
