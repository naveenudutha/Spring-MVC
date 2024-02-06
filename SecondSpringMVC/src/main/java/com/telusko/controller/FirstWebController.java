package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstWebController {
	
	@RequestMapping("/home")
	public String someMessage(Model model)
	{
		model.addAttribute("name","Naveen Udutha Rwquesting Mapping");
		
		
		return "index";
	}
	@GetMapping("/home2")
	public String someMessage2(Model model)
	{
		model.addAttribute("name","Naveen Udutha getMapping");
		System.out.println("Model implementing class : "+model.getClass().getName());
		return "index";
	}
}
