package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
	@GetMapping("/")
    public String showHomePage() {
        return "index"; // Assuming "index" is the name of your home page JSP file
    }
}
