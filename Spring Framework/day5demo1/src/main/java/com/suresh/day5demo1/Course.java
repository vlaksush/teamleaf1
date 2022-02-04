package com.suresh.day5demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class Course {

	@Value("${courseName}")
	private String courseName;
	
	@RequestMapping("/displayCourse")
	public String displayCourse() {
		return courseName;
	}
	
	@RequestMapping("/java")
	public List<String> courseDetails() {
		List<String> courseList = new ArrayList<>();
		courseList.add("HTML");
		courseList.add("CSS");
		courseList.add("JS");
		courseList.add("Core Java");
		courseList.add("JDBC");
		courseList.add("Spring Core");
		courseList.add("Spring Boot");
		courseList.add("Spring Web");
		return courseList;
		
	}
}
