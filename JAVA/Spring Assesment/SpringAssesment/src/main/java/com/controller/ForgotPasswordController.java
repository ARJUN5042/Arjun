package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.User;
import com.service.UserService;

@Controller
public class ForgotPasswordController 
{
	@Autowired
    private UserService userService;

    @GetMapping("/forgot-password")
    public String showForgotPasswordForm() {
        return "forgot-password"; // Assuming "forgot-password" is the name of your JSP file for the forgot password form
    }
    
    @PostMapping("/send-reset-link")
    public String sendResetLink(Model model, String email) {
        User user = userService.findByEmail(email);

        if (user != null) {
            // Send a password reset link to the user's email
            // Implement your email sending logic here

            model.addAttribute("message", "Password reset link sent to your email");
        } else {
            model.addAttribute("error", "Email not found");
        }

        return "forgot-password";
    }
}
