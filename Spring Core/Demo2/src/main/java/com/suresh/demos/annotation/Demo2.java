package com.suresh.demos.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2  {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PriceManager priceManager = ctx.getBean("priceManager",PriceManager.class);
		double result = priceManager.calculateItemPrice();
		System.out.println(result);
		
		
	}

}