package com.qbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.qbo.model.LoginForm;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login (Model model) {
		model.addAttribute("mensaje", "SPRING BOOT");
		model.addAttribute("loginform", new LoginForm());
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("loginform") LoginForm loginForm,
			Model model) {
		
		return "login";
	}
	
}
