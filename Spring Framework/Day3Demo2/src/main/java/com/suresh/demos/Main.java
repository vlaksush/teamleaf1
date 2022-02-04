package com.suresh.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.suresh.demos.profiles.CourseConfig;
import com.suresh.demos.profiles.CourseManager;
@Component

public class Main {
	
	public static void main(String[] args) {
		
		
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CourseConfig.class);
//		CourseManager cm = ctx.getBean(CourseManager.class);
//		String courseName = cm.displayCourseName();
//		double courseFees = cm.displayCourseFees();
//		
//		PriceManager pm = ctx.getBean(PriceManager.class);
//		double price = pm.calculateItemPrice();
//		
//		System.out.println("Calculate Item Price : "+price);
//		System.out.println("Course Name "+courseName);
//		System.out.println("Fees    "+courseFees);

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CourseConfig.class);
//		CourseManager cm1 = ctx.getBean(CourseManager.class);
//		BeanAccess ba = ctx.getBean(BeanAccess.class);
//		
//		ba.courseOneMessage();
//		System.out.println();
//		cm1.courseDetails();
//		System.out.println();
//		cm1.trainerDetails();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		
		ctx.register(CourseConfig.class);
		ctx.refresh();
		
		CourseManager courseManager = ctx.getBean(CourseManager.class);
		courseManager.courseSetupData();
		System.out.println();
		courseManager.courseDetails();
		System.out.println();
		courseManager.trainerDetails();
		
		
		
		

		ctx.close();
	}
}
