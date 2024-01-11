package com.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserService 
{
	@Autowired
	UserDao dao;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@Autowired
	HttpSession session;
	
	@Transactional
	public void insert(User u)
	{
		dao.insert(u);
	}
	
	@Transactional
	public User getByEmailAndPassword(String email, String password)
	{
		return dao.getByEmailAndPassword(email, password);
	}
	
	@Transactional
	public void update(User u)
	{
		dao.update(u);
	}
	
	@Transactional
	public User findById(int id)
	{
		return dao.findById(id);
	}
	
	@Transactional
	public void delete(int id)
	{
		dao.delete(id);
	}
	
	@Transactional
	public User getByEmail(String email)
	{
		return dao.getByEmail(email);
	}
	
	@Transactional
	public void sendOTPEmail(String toEmail, String otp)
	{
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);
		try {
			helper.setTo(toEmail);
			helper.setSubject("OTP for Password Reset");
			helper.setText("Your OTP for password reset is: "+ otp);
			
			javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("otp", otp);
	}
	
	@Transactional
	public boolean verifyOTP(String enteredOTP)
	{
		String storedOTP = (String) session.getAttribute("otp");
		return storedOTP != null && enteredOTP.equals(storedOTP);
	}
	
	@Transactional
	public void updatePassword(String email, String newPassword)
	{
		User user=dao.getByEmail(email);
		if(user != null)
		{
			user.setPassword(newPassword);
			dao.update(user);
		}
	}
	
}