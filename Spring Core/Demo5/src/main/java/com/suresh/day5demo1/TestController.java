package com.suresh.day5demo1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/displayMsg")
	@ResponseBody
	public String displayMessage() {
		return "Learning Spring Boot";
	}
	
	@RequestMapping("/displayCourse")
	@ResponseBody
	public String displayCourse() {
		return "Java Fullstack";
	}
	
}
