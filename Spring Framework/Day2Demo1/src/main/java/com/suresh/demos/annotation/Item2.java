package com.suresh.demos.annotation;

import org.springframework.stereotype.Component;

@Component("bbb")
public class Item2 implements Priceable{
	public double calculatePrice() {
		return 200.0;
	}
}
