package com.naveen.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.naveen.model.CustomerInfo;
import com.naveen.service.CustomerServiceImpl;

@Controller
public class CustomerController {
	@Autowired
	private CustomerServiceImpl service;
	
	@GetMapping("/cxlist")
	public String fetchCustomerData(Model model)
	{
		List<CustomerInfo> customerlist=service.getCustomers();
		customerlist.forEach(c->System.out.println(c));
		model.addAttribute("customers",customerlist);
		return "customerlist";
	}
	
	@GetMapping("/showform")
	public String showFormPage(Map<String,Object> model)
	{
		CustomerInfo customer=new CustomerInfo();
		model.put("customer",customer);
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String registerCx(@ModelAttribute("customer")CustomerInfo cx,Map<String,Object> model)
	{
		service.registerCustomer(cx);

		return "redirect:/cxlist";
	}
	
	@GetMapping("/updateForm")
	public String UpdateCx(@RequestParam("customerId")Integer id,@ModelAttribute("customer")CustomerInfo cx,Map<String,Object> model)
	{
		CustomerInfo customer=service.getCx(id);
		model.put("customer", customer);

		return "updateform";
	}
	
	@GetMapping("/deleteData")
	public String deleteCx(@RequestParam("customerId")Integer id,@ModelAttribute("customer")CustomerInfo cx,Map<String,Object> model)
	{
		
		service.deleteCustomer(id);

		return "redirect:/cxlist";
	}
	
	

}
