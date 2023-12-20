package com.springbookCrudJsp.SpringbootWithJsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	private UserRepository userRepository;
	
		 @GetMapping String home()
		 {
			 return "index";
		 }
		 
		 @GetMapping("/register")
		 public String register()
		 {
			 return "register";
		 }
		 
		 @GetMapping("/updateData")
		 public String update()
		 {
			 return "update";
		 }
		 
		 @PostMapping("/saveData")
		 @ResponseBody
		 public String saveData(User user)
		 {
			 userRepository.save(user);
			 System.out.println("inserted");
			 return "Data save successfully!";
		 }
		 
		 @GetMapping("/getSingalData/{id}")
		 public String getSingalData(@PathVariable int id,HttpSession session)
		 {
			 Optional<User> findById = userRepository.findById(id);
			 User user=findById.get();
			 session.setAttribute("user", user);
			 return "singalData";
		 }
		 
//		 @GetMapping("/getAllData")
//		 public String getAllData(HttpSession session)
//		 {
//			 List<User> findAll = userRepository.findAll();
//			 session.setAttribute("findAll", findAll);
//			 return "allData";
//		 }
		 
		 @GetMapping("/getAllData")
		 public ModelAndView getAllData()
		 {
			 ModelAndView mv=new ModelAndView();
			 List<User> findAll = userRepository.findAll();
			 mv.addObject("findAll", findAll);
			 mv.setViewName("allData");
			 return mv;
		 }
		 
		 @PostMapping("/updateForm")
		 @ResponseBody
		 public String updateData(User user)
		 {
			 User user1 = userRepository.save(user);
			 System.out.println(user1);
			 return "index";
		 }
		 
		 @GetMapping("/deleteData/{id}")
		 @ResponseBody
		 public String deleteData(@PathVariable int id)
		 {
			 Optional<User> findById = userRepository.findById(id);
			 User user = findById.get();
			 if(user != null)
			 {
				 userRepository.delete(user);
			 }
			 return "Data Deleted Successfully";
		 }
}