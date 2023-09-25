package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.Dao;
import com.model.Employee;

@Controller
public class ActionController 
{
	@Autowired
	Dao dao;
	
	@RequestMapping("/addemp")
	public String addemp(Model m)
	{
		m.addAttribute("comand", new Employee());
		return "addemp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addrecord(@ModelAttribute("employee") Employee employee)
	{
		dao.add(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value="/viewemp")
	public String viewemp(Model m)
	{
		List<Employee> lists=dao.getEmployees();
		m.addAttribute("lists", lists);		
		return "viewemp";
	}
	
	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m)
	{
		Employee emp=dao.getEmpById(id);
		m.addAttribute("command", emp);
		return "empedit";
	}
	
	@RequestMapping(value = "/editsave", method=RequestMethod.POST)
	public String editsave(@ModelAttribute("employee") Employee employee)
	{
		dao.updateemployee(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/deleteemp/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable int id, Model m)
	{
		dao.deleteemployee(id);
		return "redirect:/viewemp";
	}
}
