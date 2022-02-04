package com.suresh.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suresh.demos.aop.annotations.OpenDoor;


public class Main {
	public static void main(String[] args) throws Exception {
		//// autowire
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// CourseManager cm = ctx.getBean("courseManager",CourseManager.class);
		// cm.displayCourseDetails();
		// ctx.close();

		// aop
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
//		OpenDoor door = ctx.getBean(OpenDoor.class);
//		System.out.println(door.getClass().getName());
//		door.openDoorWithKey(12345);
		
		
		//aop with annotation
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		OpenDoor door = ctx.getBean(OpenDoor.class);
		System.out.println(door.getClass().getName());
		door.openDoorWithKey(12345);

	}
}
