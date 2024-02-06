package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {
	//localhost:8089/MyApp/getmessage?name=naveen
//	@GetMapping("getmessage")
//	  public String displayMessage(@RequestParam("name")String name,Map<String,Object> map) {
//		  String msg="Hello! "+name+" I hope you are enjoying the course";
//		  map.put("message", msg);
//		  
//		  return "index";
//	  }
	
//	@GetMapping("getmessage")
//	  public String displayMessage(String name,Map<String,Object> map) {
//		  String msg="Hello! "+name+" I hope you are enjoying the course";
//		  map.put("message", msg);
//		  
//		  return "index";
//	  }
	
	//multiple query parameters
	//localhost:8089/MyApp/getmessage?name=naveen&course=springboot
	
	@GetMapping("getmessage")
	  public String displayMessage(String name,String course,Map<String,Object> map) // public String displayMessage(@QueryParam("name")String name,@QueryParam("course")String course,Map<String,Object> map) 
	{
		  String msg="Hello! "+name+" I hope you are enjoying the "+course+" course";
		  map.put("message", msg);
		  
		  return "index";
	  }
	
}