package com.suresh.demos.java.way2;

import org.springframework.stereotype.Component;
@Component
public class Item1 implements Priceable {
	public double calculatePrice() {
		return 100.0;
	}
}
