package com.capg.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.demo.model.User;

//@Controller
////@RequestMapping("/trainee-info")
//public class ShowController {
//	@Value("${college.name}")
//	String collegeName;
////	@PostMapping("/show")
////	public String show(@RequestParam("tName") String Name,@RequestParam("tAge") int Age, Model m) {
////		m.addAttribute("tName",Name);
////		m.addAttribute("tAge", Age);
////		
////		m.addAttribute("tCollege",collegeName);
////		//return "hello.jsp";
////		//return "views/hello" ;// hello..moved to viewes folder 
////		return "hello";// added prefix (views/) and suffix(.jsp) through applictn.properties..
////		
////	//intially we need to add dependency//to pom.xml file TOMCAT through maven repository -> jasper-> Tomcat jasper
////		
////		
////		
////---------------------------------------------------------------------------------------------------------------------		
////	@RequestMapping(value = "/show", method = RequestMethod.POST) or can be written as
//	@PostMapping("/show")
//	public ModelAndView show(@RequestParam("tName") String Name,@RequestParam("tAge") int Age) {
//		//ModelAndView mv=new ModelAndView();
//		// mv.setViewName("hello");
//		//or can also be written in one line
//		ModelAndView mv=new ModelAndView("hello");
//		mv.addObject("tName",Name);
//		mv.addObject("tAge",Age);
//		mv.addObject("tCollege",collegeName);
//		return mv;
//	}
//	
//	@GetMapping("/")	
//	public String showIndexPage() {
//		return "index";
//	}
//	
//	
//}

//@Controller

public class ShowController {
	
	@Value("${college.name}")
	String collegeName;
	@PostMapping("/show")
	public ModelAndView show(@ModelAttribute User user) {
		ModelAndView mv=new ModelAndView("hello");
		mv.addObject("user", user);
		mv.addObject("tCollege",collegeName);
		return mv;
	}
	
	@GetMapping("/")	
	public String showIndexPage() {
		return "index";
	}
}






























