package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/hello-html")
	@ResponseBody
	public String helloHtml() {
		return """
				<html>
				<body style='font-family:Arial;'>
				<h2> Hello from Spring MVC demo page </h2>
				<p> this is the html page returned as plain string [ no jsp]</p>
				</body>
				</html>
				""" ;
	}
	
	
	@GetMapping("/hello-jsp")
	public String helloJsp(Model model) {
		model.addAttribute("App_name", "Simple MVC App");
		model.addAttribute("author","Ajmal");
		model.addAttribute("message", "hello from jsp");
		
		return "hello";
		
	}

}
