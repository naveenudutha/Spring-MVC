package com.naveen.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.naveen.bo.StudentBo;

import com.naveen.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	StudentServiceImpl service;
	
	
	@GetMapping("/getStudentList")
	public String getAllStudent(Model model)
	{
		List<StudentBo> list = service.getAllStudent();
		 model.addAttribute("list",list);
		 
		 System.out.println("student list in controller"+list);
		return"studentlist";
	}
	
	@RequestMapping("/register")
	public String RegisterStudent(@ModelAttribute("student")StudentBo st,Model model)
	{
		
		service.registerStudent(st);
		
		return "redirect:/getStudentList";
	}
	
	@GetMapping("/showForm")
	public String showForm(Map<String,Object> model)
	{
		StudentBo bo=new StudentBo();
		model.put("student", bo);
		return "registrationform";
	}
	
	@GetMapping("/deleteData")
	public String deleteStudent(@RequestParam("studentId")Integer id,@ModelAttribute("student")StudentBo bo,Map<String,Object> model)
	{
		service.deleteStudent(id);
		

		return "redirect:/getStudentList";
	}
	
	@GetMapping("/updateForm")
	public String UpdateStudent(@RequestParam("studentId")Integer id,@ModelAttribute("student")StudentBo bo,Map<String,Object> model)
	{
		StudentBo stbo=service.getStuent(id);
		model.put("student", stbo);
		
		return "updateform";
	}
	

}
