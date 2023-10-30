package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.User;
import com.service.UserService;

@Controller
public class ChangePasswordController 
{
	@Autowired
    private UserService userService;

    @GetMapping("/change-password")
    public String showChangePasswordForm() {
        return "change-password"; // Assuming "change-password" is the name of your JSP file for the change password form
    }
    
    @PostMapping("/change-password-process")
    public String changePassword(Model model, String email, String oldPassword, String newPassword, String confirmPassword) {
        User user = userService.findByEmail(email);

        if (user == null || !user.getPassword().equals(oldPassword)) {
            model.addAttribute("error", "Invalid email or old password");
            return "change-password";
        }

        if (!newPassword.equals(confirmPassword)) {
            model.addAttribute("error", "New password and confirm password do not match");
            return "change-password";
        }

        // Update the user's password in the database
        user.setPassword(newPassword);
        userService.update(user);
        
        model.addAttribute("message", "Password changed successfully");
        return "change-password";
    }
}
