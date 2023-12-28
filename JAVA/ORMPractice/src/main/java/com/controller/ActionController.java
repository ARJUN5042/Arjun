package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmpDao;
import com.model.Emp;

@Controller
public class ActionController 
{
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public String empForm(Model m)
	{
		m.addAttribute("command", new Emp());
		return "empForm";
	}
	
	@RequestMapping("/showemp")
	public String showEmp(Model m)
	{
		List<Emp> lists=dao.getAll();
		m.addAttribute("lists", lists);
		return "allList";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveEmp(@ModelAttribute("emp") Emp emp)
	{
		dao.insert(emp);
		return "redirect:/showemp";
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String editForm(@PathVariable int id,Model m)
	{
		Emp emp = dao.getById(id);
		m.addAttribute("emp", emp);
		return "editForm";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("emp") Emp emp)
	{
		dao.update(emp);
		return "redirect:/showemp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/showemp";
	}
}
