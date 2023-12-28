package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.Dao;
import com.model.Emp;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	Dao dao;
	
	@RequestMapping("empForm")
	public String empForm(Model m)
	{
		m.addAttribute("command", new Emp());
		return "empForm";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Emp emp)
	{
		dao.insert(emp);
		return "redirect:/viewAllEmp";
	}
	
	@RequestMapping("/viewAllEmp")
	public String view(Model m)
	{
		List<Emp> lists=dao.getAll();
		m.addAttribute("lists", lists);
		return "viewAllEmp";
	}
	
	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable int id, Model m)
	{
		Emp emp=dao.getById(id);
		m.addAttribute("emp", emp);
		return "editEmp";
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.POST)
	public String update(@ModelAttribute("emp") Emp emp)
	{
		dao.update(emp);
		return "redirect:/viewAllEmp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/viewAllEmp";
	}
}

