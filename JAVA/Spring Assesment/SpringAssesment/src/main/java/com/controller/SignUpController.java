package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.User;
import com.service.UserService;

@Controller
@Validated
public class SignUpController {
	@Autowired
	private UserService userService;

	@GetMapping("/signup")
	public String showSignupForm(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}

	@PostMapping("/signup-process")
    public String processSignup(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            // If validation fails, return to the signup page with error messages
            return "signup";
        }

        // Check if the email is already registered
        if (!userService.isEmailUnique(user.getEmail())) {
            result.rejectValue("email", "error.user", "Email already registered");
            return "signup";
        }

        // Save the user if everything is valid
        userService.save(user);

        // Redirect to a success page or login page
        return "redirect:/login";
    }
}
