package com.suresh.demos.java.way1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Autowired @Qualifier("item2")
	private Priceable item;
	
	@Bean
	public Item1 item1() {
		return new Item1();
	}
	
	@Bean
	public Item2 item2() {
		return new Item2();
	}
	
	@Bean
	public PriceManager priceManager() {
		PriceManager pm = new PriceManager();
		pm.setItem(item);//pm
		return pm;//item
	}
	
}
