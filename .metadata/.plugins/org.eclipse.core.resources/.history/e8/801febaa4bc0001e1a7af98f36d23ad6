package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QueryController {
	//in path parameters we will directy send the data without any key but we have to do some changes in mapping url at method level
	//localhost:8089/MyApp/getmessage/naveen/springboot
	@GetMapping("getmessage/{name}/{course}")
	  public String displayMessage(@PathVariable("name")String name,@PathVariable("course")String course,Map<String,Object> map) // public String displayMessage(@QueryParam("name")String name,@QueryParam("course")String course,Map<String,Object> map) 
	{
		  String msg="Hello! "+name+" I hope you are enjoying the "+course+"  course";
		  map.put("message", msg);
		  
		  return "index";
	  }
	
}
