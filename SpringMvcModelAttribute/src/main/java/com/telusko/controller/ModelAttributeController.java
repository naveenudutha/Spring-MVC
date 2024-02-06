package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.bo.Employee;

@Controller
public class ModelAttributeController {

	@GetMapping("/register")
	  public String displayMessage() 
	{
	
		  return "home";
	  }
	@PostMapping("/show")
	  public String diaplyEmployee(@ModelAttribute("emp")Employee emp) 
	{
	
		
		  
		  return "show";
	  }
	
}