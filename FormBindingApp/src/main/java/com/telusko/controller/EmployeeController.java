package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register")
	public String response()
	{
		return"register";
	}
	
	@PostMapping("/register")
	public String registerData(Map<String,Object> model,@ModelAttribute("employee")Employee emp)
	{
		model.put("employee", emp);
		return "show";
	}
	
	
}
