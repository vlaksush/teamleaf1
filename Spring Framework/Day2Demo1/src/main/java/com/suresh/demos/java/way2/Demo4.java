package com.suresh.demos.java.way2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4  {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		PriceManager priceManager = ctx.getBean("priceManager",PriceManager.class);
		double result = priceManager.calculateItemPrice();
		System.out.println(result);
		
		
	}

}