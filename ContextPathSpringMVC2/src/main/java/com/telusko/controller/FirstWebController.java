package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class FirstWebController {

	@GetMapping("/home")
	public String someMessage2(Model model)
	{
		model.addAttribute("message","ContextPath Application");
		System.out.println("Model implementing class : "+model.getClass().getName());
		return "index";
	}
}
