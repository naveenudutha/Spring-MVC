package com.telusko.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.bo.Student;

@Controller
@RequestMapping(("/controller1"))
public class StudentController {
	
	@GetMapping("/home")
	public ModelAndView sendData(ModelAndView mav)
	{
		Student s1=new Student(1,"Naveen1",91);
		Student s2=new Student(2,"Naveen2",92);
		Student s3=new Student(3,"Naveen3",93);
		Student s4=new Student(4,"Naveen4",94);
		
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		mav.addObject("list", list);
		
		mav.addObject("student", s1);
		mav.setViewName("index");
	
		return mav;
	}

}
