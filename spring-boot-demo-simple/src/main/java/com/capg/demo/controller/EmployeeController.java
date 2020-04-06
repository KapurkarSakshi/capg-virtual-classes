package com.capg.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capg.demo.model.Employee;
import com.capg.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	
	@PostMapping("/info")
	public String readEmployeeInfo(@ModelAttribute Employee employee,Model m) {
		int exp=service.getExperience(employee.getDateOfJng(), employee.getDateOfResgntn());
		employee.setExperience(exp);
		m.addAttribute("employee",employee);
		return "hello2";
		
	}
	

//	@GetMapping("/hello")
//	public String sayHello(@RequestParam("tbName") String traineeName,
//								Model m) {
//		m.addAttribute("trainee",traineeName);
//		return "view";
//	}
	
	@GetMapping("/")
	public String getDefaultPage() {
		return "index2";
	}

}
