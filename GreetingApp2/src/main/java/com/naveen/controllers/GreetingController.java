package com.naveen.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.service.IGrretingService;

@Controller
@RequestMapping(value="/controller" ,method=RequestMethod.GET)
public class GreetingController {
	
	@Autowired
	public IGrretingService service;
	
	@GetMapping("/welcome")
	public String getGreeting(Map<String,Object> map)
	{
		String greet=service.greet();
		
		map.put("greet", greet);
		return "welcome";
	}

}
