package com.suresh.demos.items;

import org.springframework.stereotype.Component;
@Component
public class Item2 implements Priceable{
	public double calculatePrice() {
		return 200.0;
	}
}
