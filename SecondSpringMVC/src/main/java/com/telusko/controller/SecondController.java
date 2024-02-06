package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controoler1")
public class SecondController {

	@GetMapping("/home")
	public String someMessage1(Model model)
	{
		model.addAttribute("message","Naveen");
		return "focus";
	}
	
	@PostMapping("/home")
	public String someMessage2(Model model)
	{
		model.addAttribute("message","Naveen");
		return "focus";
	}
	
	@GetMapping("/map")
	public String someMessage3(Map<String,Object> map)
	{
		map.put("message","Naveen China using Map");
		return "focus";
	}
	
	@GetMapping("/telusko")
	public void someMessage4(Model model)
	{
		model.addAttribute("message","Naveen");
		return ;
	}

}