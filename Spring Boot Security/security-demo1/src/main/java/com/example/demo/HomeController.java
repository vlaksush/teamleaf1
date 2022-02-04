package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "This is Admin Page";
	}
	
	@RequestMapping("/")
	public String sayHello() {
		return "Welcome";
	}
}
