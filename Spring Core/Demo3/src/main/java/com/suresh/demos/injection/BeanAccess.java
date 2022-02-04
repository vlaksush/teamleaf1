package com.suresh.demos.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanAccess")
public class BeanAccess {

	
//	int a = 101;
	
	@Value("#{course1.msg}")
	private String course1Msg;
	
	@Value("#{myCollections.employeeMap[101]}")
	private String firstEmployee;

	
	@Value("#{myCollections.courses[0]}")
	private String firstCourse;
	
	public void courseOneMessage() {
		System.out.println(course1Msg);
		System.out.println("Our First Employee is "+firstEmployee);
		System.out.println("Our First Course is "+firstCourse);
	}
}
