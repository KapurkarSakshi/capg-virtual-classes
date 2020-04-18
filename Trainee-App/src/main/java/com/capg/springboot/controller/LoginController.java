package com.capg.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

		@GetMapping("/")
		public String showLoginPage()
		{
				return "loginPage";
		}
		
		@PostMapping("/login")
		public String showManagementPage(@RequestParam("username") String userName,
				@RequestParam("password") String passWord)
		{
			if(userName.equals("Sakshi Kapurkar") && passWord.equals("password"))
		    	return "traineeManagement";
			else
				return "invalid";
		}
	    
	}

