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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	private UserRepository userRepository;
	
		 //localhost:8080 redirect to index.jsp
		 @GetMapping 
		 String home()
		 {
			 return "index";
		 }
		 
		 //redirect to register.jsp
		 @GetMapping("/register")
		 public String register()
		 {
			 return "register";
		 }
		 
		 //insert data into database and redirect to getAllData url
		 @PostMapping("/saveData")
//		 @ResponseBody
		 public String saveData(User user, RedirectAttributes redirectAttributes)
		 {
			 userRepository.save(user);
			 System.out.println("inserted");
			 redirectAttributes.addFlashAttribute("message", "Data Inserted Successfully");
			 return "redirect:/getAllData";
		 }
		 
		 //get All data by session
//		 @GetMapping("/getAllData")
//		 public String getAllData(HttpSession session)
//		 {
//			 List<User> findAll = userRepository.findAll();
//			 session.setAttribute("findAll", findAll);
//			 return "allData";
//		 }
		 
		 //redirect to allData.jsp with data from database with Model and View
		 //also redirect to return another GetMapping URL
		 @GetMapping("/getAllData")
		 public ModelAndView getAllData()
		 {
			 ModelAndView mv=new ModelAndView();
			 List<User> findAll = userRepository.findAll();
			 mv.addObject("findAll", findAll);
			 mv.setViewName("allData");//jsp file name
			 return mv;
		 }
		 
		 //afterclick on edit link redirect to update.jsp page with id
		 @GetMapping("/edit/{id}")
		 public String update(@PathVariable int id, HttpSession session)
		 {
			Optional<User> user=userRepository.findById(id);
			User u=user.get();
			session.setAttribute("u", u);
			 return "update";
		 }
		 		 
		 //update data and redirect to getAllData url
		 @PostMapping("/updateForm")
//		 @ResponseBody
		 public String updateData(User user)
		 {
			 User user1 = userRepository.save(user);
			 System.out.println(user1);
			 return "redirect:/getAllData";
		 }
		 
		 //delete data by Id
		 @GetMapping("/deleteData/{id}")
//		 @ResponseBody
		 public String deleteData(@PathVariable int id)
		 {
			 Optional<User> findById = userRepository.findById(id);
			 User user = findById.get();
			 if(user != null)
			 {
				 userRepository.delete(user);
			 }
			 return "redirect:/getAllData";
		 }
		 
		//Get Single Data by Id and set data into jsp page
		 @GetMapping("/getSingalData/{id}")
		 public String getSingalData(@PathVariable int id,HttpSession session)
		 {
			 Optional<User> findById = userRepository.findById(id);
			 User user=findById.get();
			 session.setAttribute("user", user);
			 return "singalData";
		 }
}