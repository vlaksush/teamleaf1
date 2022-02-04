

//@SpringBootApplication
//public class Day5demo1Application implements CommandLineRunner{
//
//	@Autowired
//	ApplicationContext ctx;
//	
//	public static void main(String[] args) {
//		System.out.println("working spring boot");
//		
//		SpringApplication.run(Day5demo1Application.class, args);
//
//		
//		
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		String[] beans = ctx.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beans));
//		
//	}
//
//}







package com.suresh.day5demo1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@SpringBootApplication
@PropertySource("myproperties.properties")
public class Day5demo1Application{

	@Autowired
	private static Environment env;
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx =  SpringApplication.run(Day5demo1Application.class, args);
		
		System.out.println("working spring boot :"+ctx.getEnvironment().getProperty("orgName"));
		System.out.println("working course is :"+ctx.getEnvironment().getProperty("course"));
		
//		String[] beans = ctx.getBeanDefinitionNames();
//		
//		for(String k : beans) {
//			System.out.println(k);
//		}
	
//		TestController tc = ctx.getBean(TestController.class);
//		System.out.println(tc.displayMessage());
	}



}
