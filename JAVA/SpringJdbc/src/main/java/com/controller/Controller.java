package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.Dao;
import com.model.Employee;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	Dao dao;
	
	@RequestMapping("/empform")
	public String empform(Model m)
	{
		m.addAttribute("command", new Employee());
		return "empform";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee employee)
	{
		dao.save(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m)
	{
		List<Employee> lists=dao.getEmployees();
		m.addAttribute("lists", lists);
		return "viewemp";
	}
	
	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m)
	{
		Employee emp = dao.getEmployeeById(id);
		m.addAttribute("emp", emp);
		return "editempform";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String updateemp(@ModelAttribute("employee") Employee employee)
	{
		dao.update(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/deleteemp/{id}")
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/viewemp";
	}
	
}
