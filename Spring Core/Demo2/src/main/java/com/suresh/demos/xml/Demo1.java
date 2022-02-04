package com.suresh.demos.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1  {
	public static void main(String[] args) {
//		Item1 item1 = new Item1();//dependent
//		System.out.println(item1.calculatePrice());
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Item1 item1 = ctx.getBean("item1",Item1.class); // accessing bean
//		Item2 item2 = ctx.getBean("item2",Item2.class);
//		System.out.println(item1.calculatePrice());
//		System.out.println(item2.calculatePrice());

		
		PriceManager priceManager = ctx.getBean("priceManager",PriceManager.class);
		double result = priceManager.calculateItemPrice();
		System.out.println(result);
		
	}

}