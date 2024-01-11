package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@org.springframework.stereotype.Controller
@SessionAttributes("email")
public class Controller 
{
	@Autowired
	UserService service;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/signup")
	public String registerForm()
	{
		return "register";
	}
	
	@RequestMapping("/login")
	public String loginForm()
	{
		return "login";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user)
	{
		service.insert(user);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/loginUser", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model m)
	{
		User user=service.getByEmailAndPassword(email, password);
		if(user != null)
		{
			session.setAttribute("user", user);
			m.addAttribute("user", user);
			return "redirect:/profile";
		}
		else
		{
			return "login";
		}
	}
	
	@RequestMapping("/profile")
	public String home(Model m, HttpSession session)
	{
		User user=(User)session.getAttribute("user");
		if(user != null)
		{
			m.addAttribute("user", user);
			return "profile";
		}
		return "login";
	}
	
	@RequestMapping("/changePassword")
	public String changePasswordForm()
	{
		return "changePassword";
	}
	
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public String updatePassword(@RequestParam("oldpassword") String oldpassword, @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword, HttpSession session, Model m)
	{
		User user=(User)session.getAttribute("user");
		if(user.getPassword().equals(oldpassword) && confirmPassword.equals(password))
		{
			user.setPassword(password);
			service.update(user);
			session.invalidate();
			return "redirect:/login";
		}
		else
		{
			m.addAttribute("error", "Invalid Old Password or confirm Password");
			return "changePassword";
		}
	}
		
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, Model model) 
	{
	    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	    response.setHeader("Pragma", "no-cache");
	    response.setHeader("Expires", "0");

	    request.getSession().invalidate();

	    return "redirect:/logoutPage";
	}

	@RequestMapping("/logoutPage")
	public String logoutPage() 
	{
	    return "logout";
	}
	
	@RequestMapping("/forgotpassword")
	public String forgotpasswordForm()
	{
		return "forgotpassword";
	}
	
	@RequestMapping(value = "/forgotPasswordForm", method = RequestMethod.POST)
	public String SendOTPForm(@RequestParam("email") String email,RedirectAttributes redirectAttributes)
	{
		String otp=generateOtp();
		service.sendOTPEmail(email, otp);
		
		session.setAttribute("email", email);
		session.setAttribute("otp", otp);
		
		return "redirect:/enterOtp";
	}
	
	private String generateOtp()
	{
		return String.format("%06d", (int)(Math.random()*999999));
	}
	
	@RequestMapping("/enterOtp")
	public String enterOtpForm(Model m)
	{
		String email=(String)session.getAttribute("email");
		m.addAttribute("email", email);
		return "enterOtp";
	}
	
	@RequestMapping(value = "/verifyOtp",method = RequestMethod.POST)
	public String verificationOTP(@RequestParam("otp") String otp,@ModelAttribute("email") String email, Model m)
	{
		if(service.verifyOTP(otp))
		{
			return "newPassword";
		}
		else {
			m.addAttribute("error", "Invalid OTP");
			return "enterOtp";
		}
	}
	
	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public String resetPassword(@RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword, RedirectAttributes redirectAttributes, HttpSession session)
	{
		if(!password.equals(confirmPassword))
		{
			redirectAttributes.addFlashAttribute("error", "Password Should Be Same");
			return "redirect:/newPassword";
		}
		else
		{
			String email=(String) session.getAttribute("email");
			
			service.updatePassword(email, password);
			session.removeAttribute("email");
			session.removeAttribute("otp");
			return "redirect:/login";
		}
	}
}
