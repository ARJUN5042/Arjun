package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.Dao;
import com.model.EmployeeModel;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	Dao dao;
	
	@RequestMapping("/empForm")
	public String empForm(Model m)
	{
		m.addAttribute("command", new EmployeeModel());
		return "empForm";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("employeeModel") EmployeeModel employeeModel)
	{
		dao.insert(employeeModel);
		return "redirect:/viewAll";
	}
	
	@RequestMapping("/viewAll")
	public String view(Model m)
	{
		List<EmployeeModel> lists = dao.getAll();
		m.addAttribute("lists", lists);
		return "viewEmpList";
	}
	
	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable int id,Model m)
	{
		EmployeeModel emp=dao.getById(id);
		m.addAttribute("emp", emp);
		return "editForm";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(@ModelAttribute("employeeModel") EmployeeModel employeeModel)
	{
		dao.update(employeeModel);
		return "redirect:/viewAll";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/viewAll";
	}
}
