package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.StudentDao;
import com.model.Student;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/register")
	public String registerForm()
	{
		return "register";
	}
	@RequestMapping("/login")
	public String loginForm()
	{
		return "login";
	}
	@RequestMapping("/viewAll")
	public String viewAll(Model m)
	{
		List<Student> lists=dao.getAll();
		m.addAttribute("lists", lists);
		return "viewAll";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("student") Student student)
	{
		dao.insert(student);
		return "redirect:/login";
	}
	@RequestMapping(value = "/loginStudent",method = RequestMethod.POST)
	public String loginStudent(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model m)
	{
		Student student=dao.login(email, password);
		if(student != null)
		{
			session.setAttribute("student", student);
			m.addAttribute("student", student);
			return "redirect:/home";
		}
		else
		{
			return "login";
		}
	}
	
	@RequestMapping("/home")
	public String home(Model m,HttpSession session)
	{
		Student student=(Student)session.getAttribute("student");
		if(student != null)
		{
			m.addAttribute("student", student);
			return "home";
		}
		return null;
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		dao.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable("id") int id,Model m)
	{
		Student s=dao.getById(id);
		m.addAttribute("s", s);
		return "edit";
	}
	
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String update(@ModelAttribute("student") Student student)
	{
		dao.update(student);
		return "redirect:/login";
	}
	
	@RequestMapping("deleteFromviewAll/{id}")
	public String deleteInAll(@PathVariable("id") int id)
	{
		dao.delete(id);
		return "redirect:/viewAll";
	}
	
	@RequestMapping("/logout")
	public String logout()
	{
		return "redirect:/index.jsp";
	}
}
