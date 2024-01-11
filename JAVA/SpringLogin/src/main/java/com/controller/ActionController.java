package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.UserModel;

@Controller
public class ActionController 
{
	@Autowired
	UserDao dao;
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("usermodel") UserModel usermodel)
	{
		dao.insert(usermodel);
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/loginUser",method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,Model m, HttpSession session)
	{
		UserModel u=dao.loginUser(email, password);
		if(u != null)
		{
			session.setAttribute("u", u);
			session.setAttribute("id", u.getId());
			return "redirect:/home";
		}
		else
		{
			m.addAttribute("error", "Invalid email or password");
			return "login";
		}
	}
	
	@RequestMapping("/home")
	public String home(HttpSession session, Model m)
	{
		int id=(Integer)session.getAttribute("id");
		UserModel u=(UserModel)session.getAttribute("u");
		if(u != null)
		{
			m.addAttribute("u", u);
			return "home";
		}
		else
		{
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String editForm(@PathVariable("id") int id,Model m)
	{
		UserModel u=dao.getById(id);
		m.addAttribute("u", u);
		return "edit";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("usermodel") UserModel usermodel)
	{
		dao.update(usermodel);
		return "redirect:/home";
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		dao.delete(id);
		return "redirect:/login";
	}
}
