package com.testPackage.conference.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.testPackage.conference.model.Registration;

@Controller
public class RegistrationController {
	
	@GetMapping("registration")
	public String getRegsitration(@ModelAttribute ("registration")Registration registration) {
		return "registration";
	}
	@PostMapping("registration")
	public String Can(@ModelAttribute ("registration")Registration registration) {
		System.out.println("Registration name: "+ registration.getName());
		return "registration";
	}
	
}
