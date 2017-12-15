package com.maxiaoteng.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {

	// create a method for showing initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	
	// create a method for showing conforming information 
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	// create the processForm version 2
	// get the name from previous page and 
	// add it to model
	
	@RequestMapping("/processFormVersion2")
	public String shoutDude(HttpServletRequest request, Model model) {
		
		// retrieve the param from request
		String theName = request.getParameter("studentName");
		
		
		// reversal the name to all letters are capital
		theName = theName.toUpperCase();
		
		// add the message to the model
		model.addAttribute("message", theName);
		
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// reversal the name to all letters are capital
		theName = theName.toUpperCase()+" , from processFormVersionThree() method.";
		
		// add the message to the model
		model.addAttribute("message", theName);
		
		
		return "helloworld";
	}
	
}














