package com.suresh.demos;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		String[] beans = ctx.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
//		Item1 item1 = ctx.getBean("item1",Item1.class);
//		System.out.println(item1.calculatePrice());
//		
//		Item2 item2 = ctx.getBean("item2",Item2.class);
//		System.out.println(item2.calculatePrice());

		
		
		PriceManager item = ctx.getBean(PriceManager.class);
		System.out.println(item.calculateItemPrice());
		
		ctx.close();
		
	}
}
